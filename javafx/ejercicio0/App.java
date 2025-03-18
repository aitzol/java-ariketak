
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    TextField txtMensaje = new TextField("Hey!");
    int btnState = 0;
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        
        EventHandler<ActionEvent> event = new btn1Handler(txtMensaje);
        /* 
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                if (btnState == 0){
                    btnState=1;
                    txtMensaje.setText("¡Hola mundo!"); 
                } else {
                    btnState=0;
                    txtMensaje.setText("Hey!"); 
                }
            } 
        };*/
         

        Button btnCambio = new Button("Click me!");
        btnCambio.setOnAction(event);
        HBox hbox = new HBox(txtMensaje, btnCambio);
        //VBox vbox = new VBox(10, txtMensaje, btnCambio);
        Scene scene = new Scene(hbox, 600, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Demo app");
        primaryStage.show();
    }   
}
