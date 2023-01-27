package Behavior.Mediator._e2_;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Mediator {
    private final List<Colleague> colleagueList;

    protected Mediator() {
        this.colleagueList = new ArrayList<>();
    }

    public void addUser(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    public void deleteUser(Colleague colleague) {
        this.colleagueList.remove(colleague);
    }

    public void sendMessage(String msg, Colleague user, Map<String, Object> par) {
        for(Colleague c : this.colleagueList) {
            if(c != user) {
                c.receive(user, msg, par);
            }
        }
    }
}
