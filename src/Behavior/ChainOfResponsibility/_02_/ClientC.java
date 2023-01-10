package Behavior.ChainOfResponsibility._02_;

public class ClientC {

    public void work() {
        Request request = new Request("이욱좋아:인증OK");

        RequestHandler requestHandler;
        requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);

        requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);

        requestHandler = new PrintRequestHandler();
        requestHandler.handler(request);
    }
}
