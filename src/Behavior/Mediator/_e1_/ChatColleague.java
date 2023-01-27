package Behavior.Mediator._e1_;

public class ChatColleague extends Colleague {
    @Override
    public void handle(String data) {
        // 데이터 변경되면 할 일
        System.out.println(this + " - " + data);
    }
}
