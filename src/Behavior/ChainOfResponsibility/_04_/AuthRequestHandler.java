package Behavior.ChainOfResponsibility._04_;

public class AuthRequestHandler extends RequestHandler {

    protected AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 상태를 확인합니다.");

        if(!request.getBody().contains("인증OK")) {
            System.out.println("인증되지 않았습니다. 요청을 중단합니다.");
        }
        else {
            System.out.println("인증되었습니다. 요청을 계속합니다.");
            super.handle(request);
        }
    }
}
