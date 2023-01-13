package Behavior.Command._01_after;

public class ButtonB {
    private final Light light;

    public ButtonB(Light light) {
        this.light = light;
    }

    public void press() {
        light.turnOn();
    }
}
