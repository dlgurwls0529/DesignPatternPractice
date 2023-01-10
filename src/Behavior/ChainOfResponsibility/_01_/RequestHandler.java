package Behavior.ChainOfResponsibility._01_;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println("요청자의 인증 상태를 확인합니다.");
        if(!request.getBody().split(":").equals("인증OK")) {
            System.out.println("인증이 완료된 사용자가 아닙니다. 어플리케이션을 종료합니다.");
        }
        else {
            System.out.println(request.getBody());
        }
    }
}
