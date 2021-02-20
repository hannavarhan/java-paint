package logic;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Segment extends Shape {
    protected Point theSecondPoint;

    Segment(Point firstPoint, Point secondPoint) {
        this.theCenter = firstPoint;
        this.theSecondPoint = secondPoint;
    }

    @Override
    protected void draw() {
        Line segment = new Line(theCenter.getX(),
                theCenter.getY(),
                theSecondPoint.getX(),
                theSecondPoint.getY());

        segment.setStroke(theLineColor);
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

    @Override
    protected void setLocation(Point theCenter) {
        super.setLocation(theCenter);
    }

    @Override
    protected Point getLocation() {
        return super.getLocation();
    }
}
