module com.aitzol {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.aitzol to javafx.fxml;
    exports com.aitzol;
}
