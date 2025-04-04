package Ejercicio4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ArrayList<Image> carrusel = new ArrayList<Image>();
    int j = 0;

    @FXML
    private Button anterior;

    @FXML
    private Button primero;

    @FXML
    private Button siguiente;

    @FXML
    private Button ultimo;

    @FXML
    private ImageView imageview;

    void setImage() {
        imageview.setImage(carrusel.get(j));
    }

    @FXML
    void anterior(ActionEvent event) {
        if (j == 0) {
            j = carrusel.size() - 1;
        } else {
            j--;
        }
        setImage();
    }

    @FXML
    void primero(ActionEvent event) {
        j = 0;
        setImage();

    }

    @FXML
    void siguiente(ActionEvent event) {
        if (j == carrusel.size() - 1) {
            j = 0;
        } else {
            j++;
        }
        setImage();

    }

    @FXML
    void ultimo(ActionEvent event) {
        j = carrusel.size() - 1;
        setImage();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ArrayList<String> imagenes = new ArrayList<String>();
        imagenes.add("Ejercicio4/imagenes/1.png");
        imagenes.add("Ejercicio4/imagenes/2.png");
        imagenes.add("Ejercicio4/imagenes/3.png");
        imagenes.add("Ejercicio4/imagenes/4.png");
        imagenes.add("Ejercicio4/imagenes/5.png");
        imagenes.add("Ejercicio4/imagenes/6.png");

        for (int i = 0; i < imagenes.size(); i++) {
            carrusel.add(new Image(imagenes.get(i)));
        }
        imageview.setImage(carrusel.get(j));
    }

}
