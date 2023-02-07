package Behavior.Visitor._01_after;

public class Watch implements Device {
    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to Rectangle");
    }
}
