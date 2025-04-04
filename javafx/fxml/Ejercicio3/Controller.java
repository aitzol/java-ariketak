package Ejercicio3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class Controller implements Initializable {

    @FXML
    private TextField apellido1;

    @FXML
    private TextField apellido2;

    @FXML
    private Button cargar;

    @FXML
    private TextField dni;

    @FXML
    private TextArea area;

    @FXML
    private TextField edad;

    @FXML
    private TextField nombre;

    @FXML
    private ComboBox<String> dni_nie;

    @FXML
    private Label lnie;

    @FXML
    private Label ldni;

    boolean dniCorrecto(String dni) {
        Pattern patron = Pattern.compile("[0-9]{8}[A-Z a-z]");
        if (!patron.matcher(dni).matches()) {
            return false;
        }
        return true;
    }

    @FXML
    void cargar(ActionEvent event) {
        Alert alert;
        if (!dniCorrecto(dni.getText())) {
            alert = new Alert(AlertType.ERROR, "El password es correcto", ButtonType.CANCEL);
            alert.showAndWait();
        } else {
            area.setText(String.format("Nombre: %s\nApellidos: %s %s\nEdad: %s\nDni: %s",
                    nombre.getText(), apellido1.getText(), apellido2.getText(), edad.getText(), dni.getText()));
        }
    }

    @FXML
    void limpiar(ActionEvent event) {
        dni.clear();
        area.clear();
        nombre.clear();
        edad.clear();
        apellido1.clear();
        apellido2.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dni_nie.getItems().setAll("DNI", "NIE");
        dni_nie.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String prev, String act) {
                System.out.println(ov);
                if (act.equals("DNI")){
                    lnie.setVisible(false);
                    ldni.setVisible(true);
                }else{
                    ldni.setVisible(false);
                    lnie.setVisible(true);
                }
            }
        });
        dni_nie.getSelectionModel().selectFirst();
        lnie.setVisible(false);
    }

}
