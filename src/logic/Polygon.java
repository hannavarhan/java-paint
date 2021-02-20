package logic;

import java.util.List;

public class Polygon extends Shape2D {
    protected List<Point> pointList;

    @Override
    protected void draw() {
        super.draw();
    }

    @Override
    protected void move() {
        super.move();
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }
}
