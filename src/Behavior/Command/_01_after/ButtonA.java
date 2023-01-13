package Behavior.Command._01_after;

public class ButtonA {
    private final Command command;

    public ButtonA(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
