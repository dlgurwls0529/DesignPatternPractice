package Creation.Prototype._10;

public class Shape implements Prototype {

    private int x;
    private int y;

    public Shape(Shape prototype) {
        this.x =  prototype.x;
        this.y = prototype.y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Prototype clone() {
        Shape shape = new Shape(this);
        return shape;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
