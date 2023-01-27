package Behavior.Mediator._e2_;

import java.util.HashMap;
import java.util.Map;

public class Guest extends Colleague {
    private final String name;

    public Guest(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String msg, Map<String, Object> par) {
        mediator.sendMessage(msg, this, par);
    }

    @Override
    public void receive(Colleague sender, String msg, Map<String, Object> par) {
        // System.out.println("미구현");
    }

    public void getTower(int numberOfTower) {
        Map<String, Object> par = new HashMap<>();
        par.put("numberOfTower", numberOfTower);
        par.put("name", this.name);
        this.send("getTower", par);
    }

    public void eatDinner() {
        Map<String, Object> par = new HashMap<>();
        par.put("name", this.name);
        this.send("eatDinner", par);
    }
}
