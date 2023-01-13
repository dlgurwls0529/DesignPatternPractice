package Behavior.Command._01_after_req;

public class LightTurnOffCommand implements Command {

    private final Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
