package Behavior.Mediator._e1_;

public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        // 데이터 변경되면 참여자들에게 데이터 주고, 처리
        for(Colleague colleague : colleagueList) {
            colleague.handle(data);
        }
    }
}
