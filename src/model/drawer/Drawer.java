package model.drawer;

import javafx.scene.canvas.GraphicsContext;
import model.Coord;

/**
 * Created by dmitry on 09.04.17.
 */

public abstract class Drawer {

    protected Coord start, end;

    public Drawer (Coord start, Coord end) {
        this.start = start;
        this.end = end;
    }


    public abstract void draw(GraphicsContext context);


}

