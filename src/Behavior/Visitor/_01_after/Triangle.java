package Behavior.Visitor._01_after;

public class Triangle implements Shape {
    @Override
    public void printTo(Device device) {
        device.print(this);
    }
}
