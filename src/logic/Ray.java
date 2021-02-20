package logic;

import javafx.scene.shape.Line;

public class Ray extends Segment {
    Ray(Point firstPoint, Point secondPoint) {
        super(firstPoint, secondPoint);
    }

    @Override
    protected void draw() {
    }

    @Override
    protected void move() {
        super.move();
    }
}
