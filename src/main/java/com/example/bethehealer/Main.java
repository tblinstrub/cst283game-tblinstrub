package com.example.bethehealer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private final String backgroundFile = "file:src/Image/PNG/game_background_1/game_background_1.png";

    @Override
    public void start(Stage stage) throws IOException {

        Image backgroundImage = new Image(backgroundFile);

        ImageView backgroundStatic = new ImageView(backgroundImage);

        VBox windowBox = new VBox(backgroundStatic);


        backgroundStatic.setPreserveRatio(true);



//        FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Scene scene = new Scene(windowBox,Double.MIN_VALUE,Double.MIN_VALUE);
        stage.setTitle("Guardian's Grace: The Healer's Quest");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}