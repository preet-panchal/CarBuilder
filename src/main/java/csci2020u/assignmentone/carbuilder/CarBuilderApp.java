package csci2020u.assignmentone.carbuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CarBuilderApp extends Application {

    /**
     * @param stage stage that is used to display the scene
     * @throws IOException exception thrown if fxmlLoader unable to load fxml file
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CarBuilderApp.class.getResource("CarBuilder-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setScene(scene);
        stage.show();
    }

    // Main function to launch application
    public static void main(String[] args) {
        launch();
    }
}