package Behavior.Command._01_before;

public class ButtonC {
    private final Door door;

    public ButtonC(Door door) {
        this.door = door;
    }

    public void press() {
        door.open();
    }
}
