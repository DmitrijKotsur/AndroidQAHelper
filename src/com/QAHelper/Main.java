package com.QAHelper;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    public Stage primaryStage;
    public Stage logStage;

    // TODO: add resources
    // TODO: add icon

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/projOverview.fxml"));
        primaryStage.setTitle("Android QAHelper");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 700, 250));
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Platform.exit();
                System.exit(0);
            }
        });
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

