package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.Coord;

/**
 * Created by dmitry on 09.04.17.
 */
public class LineDrawer extends Drawer {

    public LineDrawer(Coord start, Coord end) {
        super(start, end);
    }

    @Override
    public void draw(GraphicsContext context){
        context.setFill(Color.BLACK);
        context.strokeLine(start.x, start.y, end.x, end.y);
    }
}
