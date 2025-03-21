import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ejercicio03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulario de Registro");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        Label nameLabel = new Label("Nombre:");
        TextField nameField = new TextField();
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        Label surname1Label = new Label("Apellido 1:");
        TextField surname1Field = new TextField();
        grid.add(surname1Label, 0, 1);
        grid.add(surname1Field, 1, 1);

        Label surname2Label = new Label("Apellido 2:");
        TextField surname2Field = new TextField();
        grid.add(surname2Label, 0, 2);
        grid.add(surname2Field, 1, 2);

        Label idTypeLabel = new Label("Tipo de ID:");
        ComboBox<String> idTypeComboBox = new ComboBox<>();
        idTypeComboBox.getItems().addAll("DNI", "NIE");
        grid.add(idTypeLabel, 0, 3);
        grid.add(idTypeComboBox, 1, 3);

        Label idLabel = new Label("DNI/NIE:");
        TextField idField = new TextField();
        grid.add(idLabel, 0, 4);
        grid.add(idField, 1, 4);

        Label ageLabel = new Label("Edad:");
        TextField ageField = new TextField();
        grid.add(ageLabel, 0, 5);
        grid.add(ageField, 1, 5);

        Button acceptButton = new Button("Aceptar");
        Button clearButton = new Button("Limpiar");
        grid.add(acceptButton, 0, 6);
        grid.add(clearButton, 1, 6);

        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        grid.add(resultArea, 0, 7, 2, 1);

        acceptButton.setOnAction(e -> {
            String idType = idTypeComboBox.getValue();
            String id = idField.getText();
            if ("DNI".equals(idType) && !isValidDNI(id)) {
                resultArea.setText("Error: DNI no válido");
            } else {
                resultArea.setText("Nombre: " + nameField.getText() + "\n" +
                                "Apellido 1: " + surname1Field.getText() + "\n" +
                                "Apellido 2: " + surname2Field.getText() + "\n" +
                                "Tipo de ID: " + idType + "\n" +
                                "DNI/NIE: " + id + "\n" +
                                "Edad: " + ageField.getText());
            }
        });

        clearButton.setOnAction(e -> {
            nameField.clear();
            surname1Field.clear();
            surname2Field.clear();
            idTypeComboBox.getSelectionModel().clearSelection();
            idField.clear();
            ageField.clear();
            resultArea.clear();
        });

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isValidDNI(String dni) {
        boolean valid = false;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (dni.matches("\\d{8}[A-HJ-NP-TV-Z]")){
            int num = Integer.parseInt(dni.substring(0, 8));
            char letra = dni.charAt(8);
            if (letra == letras.charAt(num % 23)){
                valid = true;
            }
        }
        return valid;
    }
}