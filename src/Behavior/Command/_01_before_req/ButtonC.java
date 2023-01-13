package Behavior.Command._01_before_req;

public class ButtonC {
    private final Computer computer;

    public ButtonC(Computer computer) {
        this.computer = computer;
    }

    public void press() {
        computer.turnOn();
    }
}
