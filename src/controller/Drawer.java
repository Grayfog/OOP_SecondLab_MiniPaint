package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 * Created by dmitry on 29.03.17.
 */

public class Drawer {
    private static Drawer instance;

    @FXML
    private BorderPane canvas;

    public static void setInstance(Drawer instance){Drawer.instance = instance;}

    public static Drawer getInstance() {return instance;}

    private void Initialize(){
        setInstance(this);
        canvas.setOnMouseMoved(e -> Frame.getInstance().getCoordinate().setText('\t'+"X: " + e.getX() + " Y: " + e.getY()));
    }
}
