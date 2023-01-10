package Creation.Factory.Example;

public class WhiteShip extends Ship {

    public WhiteShip(String name) {
        super(name);
        setColor("white");
        setNumber(Math.abs((int)System.currentTimeMillis()));
    }

    @Override
    void checkAttribute() {
        System.out.println("- name : " + this.getName());
        System.out.println("- color : " + this.getColor());
        System.out.println("- number : " + this.getNumber());
    }
}
