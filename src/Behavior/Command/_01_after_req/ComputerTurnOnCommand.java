package Behavior.Command._01_after_req;

public class ComputerTurnOnCommand implements Command {

    private final Computer computer;

    public ComputerTurnOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
