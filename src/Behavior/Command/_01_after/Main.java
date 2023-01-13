package Behavior.Command._01_after;

public class Main {
    public static void main(String[] args) {
        ButtonA buttonA = new ButtonA(new LightTurnOnCommand(new Light()));
        ButtonB buttonB = new ButtonB(new LightTurnOnCommand(new Light()));
        ButtonC buttonC = new ButtonC(new DoorOpenCommand(new Door()));

        buttonA.press();
        buttonB.press();
        buttonC.press();
    }
}
