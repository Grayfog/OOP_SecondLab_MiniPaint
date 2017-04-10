package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Coord;

import static java.lang.Math.abs;

/**
 * Created by dmitry on 10.04.17.
 */
public class RectangleDrawer extends SquareDrawer {

    public double height, width;

    public RectangleDrawer(Coord start, Coord end) {
        super(start, end);
    }

    @Override
    public void draw(GraphicsContext context)
    {
        context.setFill(Color.RED);
        height = abs(start.y - end.y);
        width = abs(start.x - start.y);
        context.fillRect(start.x, start.y, width, height);
    }
}
