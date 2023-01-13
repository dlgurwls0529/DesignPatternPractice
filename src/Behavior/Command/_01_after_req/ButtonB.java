package Behavior.Command._01_after_req;

public class ButtonB {
    private final Command command;

    public ButtonB(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
