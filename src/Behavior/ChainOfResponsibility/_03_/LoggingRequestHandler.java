package Behavior.ChainOfResponsibility._03_;

public class LoggingRequestHandler extends RequestHandler {

    protected LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("요청을 LOGGING 합니다.");
        super.handle(request);
    }
}
