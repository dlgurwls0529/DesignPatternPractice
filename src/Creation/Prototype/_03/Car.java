package Creation.Prototype._03;

public class Car implements Cloneable{
    private String color;
    private String name;
    private String speed;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
