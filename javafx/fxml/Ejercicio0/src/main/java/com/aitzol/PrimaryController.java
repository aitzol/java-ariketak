package com.aitzol;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {
    private int buttonStatus = 0;
    public int getButtonStatus() {
        return buttonStatus;
    }
    public  void toggleButtonStatus() {
        if ( buttonStatus == 0 ) {
            buttonStatus = 1;
        } else {
            buttonStatus = 0;
        }   
    }

    @FXML
    private Label mainLbl;

    @FXML
    private Button primaryButton;

    @FXML
    private void changeText() {
        if ( buttonStatus == 0 ) {
            toggleButtonStatus();
            mainLbl.setText("Hello world!");
        } else {
            toggleButtonStatus();
            mainLbl.setText("Hey");
        }
    
    }
}
