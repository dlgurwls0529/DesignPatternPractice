package Behavior.Mediator._e2_;

import java.util.Map;

public abstract class Colleague {
    protected final Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg, Map<String, Object> par);

    public abstract void receive(Colleague sender, String msg, Map<String, Object> par);
}
