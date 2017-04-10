package model.figure;

import model.drawer.Drawer;
import model.drawer.LineDrawer;

/**
 * Created by dmitry on 09.04.17.
 */


public class Line extends Figure{

    @Override
    public Drawer getDrawer() {
        return new LineDrawer(this.start, this.end);
    }
}