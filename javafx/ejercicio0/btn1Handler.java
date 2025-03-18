import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class btn1Handler implements EventHandler<ActionEvent> {
    int btnState = 0;
    TextField txtMensaje;
    public btn1Handler(TextField txtMensaje){
        this.txtMensaje = txtMensaje;
    }
    public void handle(ActionEvent e) {
        if (btnState == 0){
            btnState=1;
            this.txtMensaje.setText("¡Hola mundo!"); 
        } else {
            btnState=0;
            this.txtMensaje.setText("Hey!"); 
        }

        
    }

}
