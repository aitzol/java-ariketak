package Ejercicio2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private RadioButton ER;

    @FXML
    private RadioButton isaac;

    @FXML
    private RadioButton rd2;

    @FXML
    private TextField respuesta;

    @FXML
    private RadioButton tf;

    @FXML
    private ToggleGroup vj;

    @FXML
    void cargar(ActionEvent event) {
        RadioButton x = (RadioButton) vj.getSelectedToggle();
        respuesta.setText(x.getText());
    }

}
