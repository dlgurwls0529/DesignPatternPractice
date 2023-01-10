package Creation.Factory.BasicFactory;

public class AldabraTurtleFactory implements TurtleFactory {

    @Override
    public Turtle createTurtle() {
        return new AldabraTurtle();
    }
}
