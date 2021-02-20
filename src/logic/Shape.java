package logic;

import java.awt.*;

abstract class Shape {
    protected Point theCenter;
    protected Color theLineColor;

    // abstract
    protected abstract void draw();
    protected abstract void move();

    // others
    protected Point getTheCenter() {
        return null;
    }

    protected  Color getTheLineColor() {
        return null;
    }

    protected void setTheCenter(Point theCenter) {}

    protected void setTheLineColor(Color theLineColor) {}
}
