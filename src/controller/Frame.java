package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import model.Coord;
import model.figure.*;

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

    private GraphicsContext context;

    private Coord startPoint;

    private Figure figure;

    public static void setInstance(Frame instance) {Frame.instance = instance;}

    public static Frame getInstance() {return instance;}

    @FXML
    private void initialize(){

        setInstance(this);

        context = canvas.getGraphicsContext2D();

        canvas.setOnMouseMoved(e -> Frame.getInstance().coordinates.setText('\t'+"X: " + e.getX() + " Y: " + e.getY()) );

        canvas.setOnMousePressed( e -> {
            startPoint = new Coord(e.getX(), e.getY() );
        });

        canvas.setOnMouseDragged( e -> {
            Frame.getInstance().coordinates.setText('\t'+"X: " + e.getX() + " Y: " + e.getY());
        });

        canvas.setOnMouseReleased( e -> {
            figure.init(startPoint, new Coord(e.getX(), e.getY()));
            figure.getDrawer().draw(context);
            //canvas.getGraphicsContext2D().strokeLine(startPointX, startPointY, e.getX(), e.getY());
            Frame.getInstance().pane.getChildren().add(canvas);
        });

    }

    public void clickLineButton(ActionEvent actionEvent) {
        figure = new Line();
    }

    public void clickCircleButton(ActionEvent actionEvent) {
        figure = new Circle();
    }

    public void clickOvalButton(ActionEvent actionEvent) {
        figure = new Ellipse();
    }

    public void clickSquareButton(ActionEvent actionEvent) {
        figure = new Square();
    }

    public void clickRectangleButton(ActionEvent actionEvent) {
        figure = new Rectangle();
    }

    public void clickTriangleButton(ActionEvent actionEvent) {

    }
}
