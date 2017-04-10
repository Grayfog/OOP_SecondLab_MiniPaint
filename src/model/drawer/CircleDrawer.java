package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Coord;

import static java.lang.Math.abs;

/**
 * Created by dmitry on 10.04.17.
 */
public class CircleDrawer extends Drawer{

    private double height;

    public CircleDrawer(Coord start, Coord end) {
        super(start, end);
    }

    @Override
    public void draw(GraphicsContext context){
        context.setFill(Color.BLACK);
        height = abs(start.x - end.x);
        context.fillOval(start.x, start.y, height, height);
    }
}
