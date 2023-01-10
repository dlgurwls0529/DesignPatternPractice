package Creation.Factory.DependencyInjectionBefore;

public class WhiteShip implements Ship{
    private String color;
    private String name;
    private int speed;

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public WhiteShip() {
        setName("WhiteShip");
        setColor("White");
        setSpeed(20);
    }

    @Override
    public void info() {
        System.out.println("name : " + getName());
        System.out.println("color : " + getColor());
        System.out.println("speed : " + getSpeed());
    }
}
