package logic;

import javafx.scene.paint.Color;

/**
 * The basic class to build app architecture
 * theCenter is a position for placing some shape
 * draw() and move() hasn't implementation at this class,
 * therefore, they marked as abstract
 * Color class was taken at java.awt library
 */

abstract class Shape {
    protected Point theCenter;
    protected Color theLineColor;

    protected abstract void draw();
    protected abstract void move();

    protected void setLocation(Point theCenter) {}
    protected void setTheLineColor(Color theLineColor) {}

    protected Point getLocation() {
        return null;
    }
    protected  Color getTheLineColor() {
        return null;
    }
}
