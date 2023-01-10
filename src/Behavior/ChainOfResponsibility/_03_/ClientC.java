package Behavior.ChainOfResponsibility._03_;

public class ClientC {

    public void work() {
        RequestHandler requestHandler = RequestHandlerContainer.getRequestHandler();
        Request request = new Request("요청이다:인증OK");
        requestHandler.handle(request);
    }
}
