package main;

import controller.Frame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/view/frame.fxml"));
        Scene scene = new Scene(root, 200, 315);
        primaryStage.setTitle("Paint");
        primaryStage.setScene(scene);
        new Frame();
        primaryStage.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
