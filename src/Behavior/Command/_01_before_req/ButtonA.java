package Behavior.Command._01_before_req;

public class ButtonA {
    private final Faucet faucet;

    public ButtonA(Faucet faucet) {
        this.faucet = faucet;
    }

    public void press() {
        faucet.turnOn(10);
    }
}
