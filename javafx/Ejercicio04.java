import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ejercicio04 extends Application {

    private int currentIndex = 0;
    private final String[] imagePaths = {
            "./src/images/photo1.jpeg",
            "./src/images/photo2.jpeg",
            "./src/images/photo3.jpeg",
            "./src/images/photo4.jpeg",
            "./src/images/photo5.jpeg",
            "./src/images/photo6.jpeg"
    };
    private ImageView imageView;

    @Override
    public void start(Stage primaryStage) {
        imageView = new ImageView();
        updateImageView();

        Button firstButton = new Button("First");
        firstButton.setOnAction(e -> showFirstImage());

        Button previousButton = new Button("Previous");
        previousButton.setOnAction(e -> showPreviousImage());

        Button nextButton = new Button("Next");
        nextButton.setOnAction(e -> showNextImage());

        Button lastButton = new Button("Last");
        lastButton.setOnAction(e -> showLastImage());

        HBox buttonBox = new HBox(10, firstButton, previousButton, nextButton, lastButton);
        BorderPane root = new BorderPane();
        root.setCenter(imageView);
        root.setBottom(buttonBox);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Photo Carousel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateImageView() {
        
        try {
            System.out.println(new File(".").getCanonicalPath());
            FileInputStream imgFile = new FileInputStream(imagePaths[currentIndex]);
            Image image = new Image(imgFile);
            imageView.setImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showFirstImage() {
        currentIndex = 0;
        updateImageView();
    }

    private void showPreviousImage() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImageView();
        }
    }

    private void showNextImage() {
        if (currentIndex < imagePaths.length - 1) {
            currentIndex++;
            updateImageView();
        }
    }

    private void showLastImage() {
        currentIndex = imagePaths.length - 1;
        updateImageView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
