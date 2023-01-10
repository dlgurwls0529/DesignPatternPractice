package Behavior.ChainOfResponsibility._03_;

public class ClientB {

    public void work() {
        RequestHandler requestHandler = RequestHandlerContainer.getRequestHandler();
        Request request = new Request("요청요청:인증OK");
        requestHandler.handle(request);
    }
}
