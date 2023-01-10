package Creation.Factory.BasicFactory;

public class ExternClass {
    public static void introduceDI(TurtleFactory turtleFactory) {
        turtleFactory.createTurtle().introduce();
    }
}
