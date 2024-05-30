package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Main application class for the Tic-Tac-Toe game.
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);
        stage.setTitle("Tic-tac-toe Game");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Main method to launch the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
}