package Behavior.ChainOfResponsibility._04_;

public class ClientC implements Client {

    @Override
    public void work() {
        Request request = new Request("REQ : 인증OK");
        RequestHandler requestHandler = RequestHandlerContainer.getChainedRequestHandler();
        requestHandler.handle(request);
    }
}
