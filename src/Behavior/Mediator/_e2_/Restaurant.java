package Behavior.Mediator._e2_;

import java.util.Map;

public class Restaurant extends Colleague {
    public Restaurant(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg, Map<String, Object> par) {
        mediator.sendMessage(msg, this, par);
    }

    @Override
    public void receive(Colleague sender, String msg, Map<String, Object> par) {
        if(msg.equals("eatDinner")) {
            System.out.println(par.get("name") + " eat dinner");
        }
    }

    public void clean() {
        send("clean", null);
    }
}
