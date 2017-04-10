package model.figure;

import model.drawer.Drawer;
import model.drawer.RectangleDrawer;

/**
 * Created by dmitry on 10.04.17.
 */
public class Rectangle extends Figure {
    @Override
    public Drawer getDrawer() {
        return new RectangleDrawer(this.start, this.end);
    }
}
