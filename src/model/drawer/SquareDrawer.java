package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Coord;
import model.figure.Figure;

import static java.lang.Math.abs;

/**
 * Created by dmitry on 10.04.17.
 */
public class SquareDrawer extends Drawer {

    private double height;

    public SquareDrawer(Coord start, Coord end) {
        super(start, end);
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(Color.BLUE);
        height = abs(start.x - start.y);
        context.fillRect(start.x, start.y, height, height);
    }
}
