package Creation.Factory.BasicFactory;

public class AldabraTurtle extends DefaultTurtle{

    public AldabraTurtle() {
        setCubicAmount(13);
        setName("Aldabra");
        setColor("black");
        setSize(5);
    }

    @Override
    public void introduce() {
        System.out.println("****");
        System.out.println("my name is " + getName());
        System.out.println("my color is " + getColor());
        System.out.println("my size is " + getSize());
        System.out.println("my cubicAmount is " + getCubicAmount());
        System.out.println("***");
    }
}
