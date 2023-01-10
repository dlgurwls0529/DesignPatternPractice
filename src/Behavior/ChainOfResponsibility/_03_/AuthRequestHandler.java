package Behavior.ChainOfResponsibility._03_;

public class AuthRequestHandler extends RequestHandler {

    protected AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if(!request.getBody().contains("인증OK")) {
            System.out.println("인증이 완료된 사용자가 아닙니다. 어플리케이션을 종료합니다.");
        }
        else {
            super.handle(request);
        }

    }
}
