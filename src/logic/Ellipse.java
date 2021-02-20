package logic;

public class Ellipse extends Shape2D {
    protected Point theFirstRadius;
    protected Point theSecondRadius;

    @Override
    protected void draw() {
        super.draw();
    }

    @Override
    protected void move() {
        super.move();
    }

    public Point getTheFirstRadius() {
        return theFirstRadius;
    }

    public void setTheFirstRadius(Point theFirstRadius) {
        this.theFirstRadius = theFirstRadius;
    }

    public Point getTheSecondRadius() {
        return theSecondRadius;
    }

    public void setTheSecondRadius(Point theSecondRadius) {
        this.theSecondRadius = theSecondRadius;
    }
}
