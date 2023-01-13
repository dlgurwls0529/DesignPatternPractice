package Behavior.Command._01_before;

public class ButtonB {
    private final Light light;

    public ButtonB(Light light) {
        this.light = light;
    }

    public void press() {
        light.turnOn();
    }
}
