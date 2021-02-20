package logic;

import java.awt.*;

public class Segment extends Shape {
    protected Point theSecondPoint;

    @Override
    protected void draw() {

    }

    @Override
    protected void move() {

    }

    public Point getTheSecondPoint() {
        return theSecondPoint;
    }

    public void setTheSecondPoint(Point theSecondPoint) {
        this.theSecondPoint = theSecondPoint;
    }
}
