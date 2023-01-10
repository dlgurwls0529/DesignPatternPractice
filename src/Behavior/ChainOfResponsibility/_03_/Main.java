package Behavior.ChainOfResponsibility._03_;

public class Main {
    public static void main(String[] args) {
        RequestHandler requestHandler = RequestHandlerContainer
                .getRequestHandler();
        // dependency injection



        Request checkedRequest = new Request("윤기좋아.:인증OK");
        requestHandler.handle(checkedRequest);

        Request unCheckedRequest = new Request("윤기좋아.");
        requestHandler.handle(unCheckedRequest);
    }
}
