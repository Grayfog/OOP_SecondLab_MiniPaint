package model.figure;

import model.drawer.Drawer;
import model.drawer.SquareDrawer;

/**
 * Created by dmitry on 10.04.17.
 */
public class Square extends Figure{

    @Override
    public Drawer getDrawer() {
        return new SquareDrawer(this.start, this.end);
    }
}
