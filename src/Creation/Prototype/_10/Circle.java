package Creation.Prototype._10;

public class Circle extends Shape {

    private int r;

    public Circle(Circle prototype) {
        super(prototype);
        this.r = prototype.r;
    }

    public Circle(Shape prototype, int r) {
        super(prototype);
        this.r = r;
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public Prototype clone() {
        Circle circle = new Circle(this);
        return circle;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
