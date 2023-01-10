package Creation.Factory.Example;

public class FastShip extends Ship {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    void checkAttribute() {
        System.out.println("- name : " + this.getName());
        System.out.println("- color : " + this.getColor());
        System.out.println("- number : " + this.getNumber());
        System.out.println("- speed : " + this.getSpeed());
    }

    public FastShip(String name) {
        super(name);
        this.setColor("black");
        this.setSpeed(10);
        this.setNumber(Math.abs((int)System.currentTimeMillis()));
    }

}
