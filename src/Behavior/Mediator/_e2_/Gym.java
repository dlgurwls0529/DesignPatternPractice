package Behavior.Mediator._e2_;

import java.util.Map;

public class Gym extends Colleague {

    public Gym(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg, Map<String, Object> par) {
        mediator.sendMessage(msg, this, par);
    }

    @Override
    public void receive(Colleague sender, String msg, Map<String, Object> par) {
       // System.out.println("미구현");
    }

    public void clean() {
        send("clean", null);
    }
}
