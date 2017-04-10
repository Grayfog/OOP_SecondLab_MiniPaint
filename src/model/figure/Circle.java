package model.figure;

import model.drawer.CircleDrawer;
import model.drawer.Drawer;

/**
 * Created by dmitry on 10.04.17.
 */
public class Circle extends Figure {
    @Override
    public Drawer getDrawer() {
        return new CircleDrawer(this.start, this.end);
    }
}
