package Behavior.Command._01_after;

public class DoorOpenCommand implements Command {

    private final Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
