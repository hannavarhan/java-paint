package logic;

public class RegularPolygon extends Polygon {
    private int theSidesAmount;

    @Override
    protected void draw() {
        super.draw();
    }

    @Override
    protected void move() {
        super.move();
    }

    public int getTheSidesAmount() {
        return theSidesAmount;
    }

    public void setTheSidesAmount(int theSidesAmount) {
        this.theSidesAmount = theSidesAmount;
    }
}
