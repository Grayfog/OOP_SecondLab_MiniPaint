package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Coord;

import static java.lang.Math.abs;

/**
 * Created by dmitry on 10.04.17.
 */
public class EllipseDrawer extends CircleDrawer{

    private double height, width;

    public EllipseDrawer(Coord start, Coord end) {
        super(start, end);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(Color.GREEN);
        height = abs(start.y - end.y);
        width = abs(start.x - start.y);
        context.fillOval(start.x, start.y, width, height);
    }
}
