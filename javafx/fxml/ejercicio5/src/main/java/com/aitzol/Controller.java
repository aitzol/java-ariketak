package com.aitzol;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

    @FXML
    private Button add;

    @FXML
    private TableView<Contacto> agenda;

    @FXML
    private TextField apellido1;

    @FXML
    private TextField apellido2;

    @FXML
    private TableColumn<Contacto, String> capellido1;

    @FXML
    private TableColumn<Contacto, String> capellido2;

    @FXML
    private TableColumn<Contacto, String> cdni;

    @FXML
    private TableColumn<Contacto, String> cnombre;

    @FXML
    private TableColumn<Contacto, String> ctelefono;

    @FXML
    private TextField dni;

    @FXML
    private TextField nombre;

    @FXML
    private TextField telefono;

    @FXML
    void addContact(ActionEvent event) {
        ObservableList<Contacto> data = agenda.getItems();
        data.add(new Contacto(nombre.getText(),
                apellido1.getText(),
                apellido2.getText(),
                dni.getText(),
                telefono.getText()));

        dni.clear();
        nombre.clear();
        apellido1.clear();
        apellido2.clear();
        telefono.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        cnombre.setCellValueFactory(
                new PropertyValueFactory<Contacto, String>("nombre"));
        capellido1.setCellValueFactory(
                new PropertyValueFactory<Contacto, String>("apellido1"));
        capellido2.setCellValueFactory(
                new PropertyValueFactory<Contacto, String>("apellido2"));
        cdni.setCellValueFactory(
                new PropertyValueFactory<Contacto, String>("dni"));
        ctelefono.setCellValueFactory(
                new PropertyValueFactory<Contacto, String>("telefono"));
         
        // agenda.getColumns().addAll(capellido1, capellido2, cnombre, ctelefono, cdni);
    }

}
