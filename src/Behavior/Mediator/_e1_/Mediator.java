package Behavior.Mediator._e1_;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagueList;

    public Mediator() {
        colleagueList = new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague) {
        if(colleagueList != null) {
            return colleagueList.add(colleague);
        }
        else {
            return false;
        }
    }

    public abstract void mediate(String data);
}
