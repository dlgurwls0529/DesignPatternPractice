package Creation.Factory.BasicFactory;

public class EasternHermanTurtleFactory implements TurtleFactory{

    @Override
    public Turtle createTurtle() {
        return new EasternHermanTurtle();
    }
}
