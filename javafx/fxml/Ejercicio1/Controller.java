package Ejercicio1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button cargar;

    @FXML
    private TextField password;

    @FXML
    private TextField usuario;

    @FXML
    void login(ActionEvent event) {
        String cUsuario = usuario.getText();
        String cPassword = password.getText();
        Alert alert;
        if (cUsuario.equals("admin") && cPassword.equals("admin")){
            alert = new Alert(AlertType.CONFIRMATION, "El password es correcto", ButtonType.CANCEL);
            
        }else{
            alert = new Alert(AlertType.ERROR, "El password es correcto", ButtonType.CANCEL);
        }
        alert.showAndWait();
    }

}
