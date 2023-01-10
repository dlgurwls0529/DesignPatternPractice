package Behavior.ChainOfResponsibility._04_;

public class LimitRequestHandler extends RequestHandler {

    private final int limit;

    protected LimitRequestHandler(RequestHandler requestHandler, int limit) {
        super(requestHandler);
        this.limit = limit;
    }

    @Override
    public void handle(Request request) {
        System.out.println("요청의 길이 검사를 실시합니다.");

        if(request.getBody().length() < limit) {
            System.out.println("요청의 길이가 적절합니다. 요청을 계속합니다.");
            super.handle(request);
        }
        else {
            System.out.println("요청의 길이가 부적절합니다. 요청을 중단합니다.");
        }
    }
}
