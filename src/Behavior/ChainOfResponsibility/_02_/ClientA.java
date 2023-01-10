package Behavior.ChainOfResponsibility._02_;

public class ClientA {

    public void work() {
        Request request = new Request("윤기가좋다:인증OK");

        RequestHandler requestHandler;
        requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);

        requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);

        requestHandler = new PrintRequestHandler();
        requestHandler.handler(request);
    }
}
