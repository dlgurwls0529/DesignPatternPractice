package Behavior.ChainOfResponsibility._02_;

public class ClientB {

    public void work() {
        Request request = new Request("자퇴하고싶다:인증OK");

        RequestHandler requestHandler;
        requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);

        requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);

        requestHandler = new PrintRequestHandler();
        requestHandler.handler(request);
    }
}
