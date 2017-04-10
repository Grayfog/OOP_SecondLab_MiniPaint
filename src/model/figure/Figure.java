package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by udmit on 01.03.2017.
 */
public abstract class Figure {

    protected Coord start;
    protected Color color;

    Figure (Coord start, Color color){
        this.start = start;
        this.color = color;
    }

}
