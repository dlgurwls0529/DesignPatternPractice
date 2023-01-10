package Behavior.ChainOfResponsibility._02_;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("요청을 LOGGING 합니다.");
        super.handler(request);
    }
}
