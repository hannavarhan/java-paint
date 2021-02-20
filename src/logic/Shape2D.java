package logic;

import java.awt.*;

public class Shape2D extends Shape {
    protected Color theFillColor;

    public Color getTheFillColor() {
        return theFillColor;
    }

    public void setTheFillColor(Color theFillColor) {
        this.theFillColor = theFillColor;
    }

    @Override
    protected void draw() {}

    @Override
    protected void move() {}
}
