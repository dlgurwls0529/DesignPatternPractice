package Behavior.Command._01_before;

public class ButtonA {
    private final Light light;

    public ButtonA(Light light) {
        this.light = light;
    }

    public void press() {
        light.turnOn();
    }
}
