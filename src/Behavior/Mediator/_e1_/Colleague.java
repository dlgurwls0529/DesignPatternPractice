package Behavior.Mediator._e1_;

public abstract class Colleague {
    private Mediator mediator;

    public boolean join(Mediator mediator) {
        if(mediator == null) {
            return false;
        }
        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    // 데이터를 메디에이터에게 전달
    public void sendData(String data) {
        if(mediator != null) {
            mediator.mediate(data);
        }
    }

    public abstract void handle(String data);
}
