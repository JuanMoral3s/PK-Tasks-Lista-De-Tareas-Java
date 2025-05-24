package org.example.pktaskslistadetareasjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/pktaskslistadetareasjava/view/TaskListView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("/org/example/pktaskslistadetareasjava/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        stage.getIcons().add(new Image(getClass().getResourceAsStream("/org/example/pktaskslistadetareasjava/icon.jpg")));
    }

    public static void main(String[] args) {
        launch();
    }
}
