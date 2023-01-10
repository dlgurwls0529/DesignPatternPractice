package Creation.Factory.BasicFactory;

public class EasternHermanTurtle extends DefaultTurtle {

    public EasternHermanTurtle() {
        setColor("brown");
        setCubicAmount(13);
        setSize(2);
        setName("EasternHerman");
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
