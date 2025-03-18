import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ejercicio01 extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        GridPane grid = new GridPane();

        Label userLabel = new Label("Usuario:");
        TextField userTextField = new TextField();
        Label passLabel = new Label("Password:");
        TextField passTextField = new TextField();
        Button loginButton = new Button("Login");

        grid.add(userLabel, 0, 0);
        grid.add(userTextField, 1, 0);
        grid.add(passLabel, 0, 1);
        grid.add(passTextField, 1, 1);
        grid.add(loginButton, 1, 2);

        loginButton.setOnAction(e -> {
            String user = userTextField.getText();
            String password = passTextField.getText();
            Alert alert = new Alert(AlertType.INFORMATION);

            if ("admin".equals(user) && "admin".equals(password)) {
                alert.setContentText("Bienvenido");
            } else {
                alert.setContentText("User o password desconocido");
            }
            alert.showAndWait();
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
