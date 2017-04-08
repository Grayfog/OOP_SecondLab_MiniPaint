package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;

/**
 * Created by dmitry on 19.03.17.
 */
public class Frame {

    private static Frame instance;
    @FXML
    private Canvas canvas;
    @FXML
    private Label coordinates;
    @FXML
    private BorderPane pane;

    private static ArrayList<Canvas> figure = new ArrayList<>();

    private double startPointX, startPointY;

    public static void setInstance(Frame instance) {Frame.instance = instance;}

    public static Frame getInstance() {return instance;}

    @FXML
    private void initialize(){

        setInstance(this);
        canvas.setOnMouseMoved(e -> Frame.getInstance().coordinates.setText('\t'+"X: " + e.getX() + " Y: " + e.getY()) );
        canvas.setOnMousePressed( e -> {
            startPointX = e.getX();
            startPointY = e.getY();
        });
        canvas.setOnMouseReleased( e -> {
            Canvas c = new Canvas(200,315);
            c.getGraphicsContext2D().strokeLine(startPointX, startPointY, e.getX(), e.getY());
            figure.add(c);
            Frame.getInstance().pane.getChildren().add(c);
        });

    }

    public Label getCoordinate() {return coordinates;}

}
