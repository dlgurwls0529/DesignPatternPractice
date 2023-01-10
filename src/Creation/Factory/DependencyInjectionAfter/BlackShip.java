package Creation.Factory.DependencyInjectionAfter;

public class BlackShip implements Ship {
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

    public BlackShip() {
        setName("BlackShip");
        setColor("Black");
        setSpeed(10);
    }

    @Override
    public void info() {
        System.out.println("name : " + getName());
        System.out.println("color : " + getColor());
        System.out.println("speed : " + getSpeed());
    }
}
