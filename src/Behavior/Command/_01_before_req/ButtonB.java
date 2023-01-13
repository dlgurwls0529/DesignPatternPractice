package Behavior.Command._01_before_req;

public class ButtonB {
    private final Faucet faucet;

    public ButtonB(Faucet faucet) {
        this.faucet = faucet;
    }

    public void press() {
        faucet.turnOn(10);
    }
}
