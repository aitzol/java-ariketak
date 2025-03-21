import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio02 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear los elementos de la interfaz
       
        Label questionLabel = new Label("¿Cuál es el mejor videojuego?");
        
        RadioButton option1 = new RadioButton("The Legend of Zelda");
        RadioButton option2 = new RadioButton("Super Mario Bros");
        RadioButton option3 = new RadioButton("Minecraft");
        RadioButton option4 = new RadioButton("Fortnite");
        
        ToggleGroup group = new ToggleGroup();
        option1.setToggleGroup(group);
        option2.setToggleGroup(group);
        option3.setToggleGroup(group);
        option4.setToggleGroup(group);
        
        Button submitButton = new Button("Submit");
        TextField resultTextField = new TextField();
        resultTextField.setEditable(false);
        
        // Configurar el evento del botón
        submitButton.setOnAction(e -> {
            RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
            if (selectedRadioButton != null) {
                resultTextField.setText(selectedRadioButton.getText());
            }
        });
        
        // Crear el layout y añadir los elementos
        VBox vbox = new VBox(10, questionLabel, option1, option2, option3, option4, submitButton, resultTextField);
        
        // Crear la escena y añadir el layout
        Scene scene = new Scene(vbox, 300, 400);
        
        // Configurar el escenario
        primaryStage.setTitle("Ejercicio02");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
