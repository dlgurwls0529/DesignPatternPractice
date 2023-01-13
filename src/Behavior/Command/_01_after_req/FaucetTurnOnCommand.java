package Behavior.Command._01_after_req;

public class FaucetTurnOnCommand implements Command {

    private final Faucet faucet;

    public FaucetTurnOnCommand(Faucet faucet) {
        this.faucet = faucet;
    }

    @Override
    public void execute() {
        faucet.turnOn(10);
    }
}
