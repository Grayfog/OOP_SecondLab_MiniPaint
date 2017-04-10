package model.figure;

import model.drawer.Drawer;
import model.drawer.EllipseDrawer;

/**
 * Created by dmitry on 10.04.17.
 */
public class Ellipse extends Figure {

    @Override
    public Drawer getDrawer() {
        return new EllipseDrawer(this.start, this.end);
    }
}
