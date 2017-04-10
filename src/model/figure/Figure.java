package model.figure;

import model.Coord;
import model.drawer.Drawer;

/**
 * Created by udmit on 01.03.2017.
 */
public abstract class Figure {

    protected Coord start, end;

    public final void init(Coord start, Coord end)
    {
        this.start = start;
        this.end = end;
    }

    public abstract Drawer getDrawer();
}


