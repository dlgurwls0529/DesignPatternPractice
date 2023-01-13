package Behavior.Command._01_after_req;

public class ButtonC {
    private final Command command;

    public ButtonC(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
