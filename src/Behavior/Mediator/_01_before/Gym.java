package Behavior.Mediator._01_before;

public class Gym {
    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
