package Creation.Factory.Example;

public class BlackShip extends Ship{

    @Override
    void checkAttribute() {
        System.out.println("- name : " + this.getName());
        System.out.println("- color : " + this.getColor());
        System.out.println("- number : " + this.getNumber());
    }

    public BlackShip(String name) {
        super(name);
        this.setColor("black");
        this.setNumber(Math.abs((int)System.currentTimeMillis()));
    }
}
