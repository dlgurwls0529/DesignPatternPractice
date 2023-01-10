package Behavior.ChainOfResponsibility._04_;

public class TrimRequestHandler extends RequestHandler {

    protected TrimRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("공백 제거를 실시합니다.");
        request.setBody(request.getBody().trim().replace(" ", ""));
        super.handle(request);
    }
}
