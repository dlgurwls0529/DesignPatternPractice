package Behavior.ChainOfResponsibility._04_;

public class ClientA implements Client {

    @Override
    public void work() {
        Request request = new Request("this is REQUEST:인증OK");
        RequestHandler requestHandler = RequestHandlerContainer.getChainedRequestHandler();
        requestHandler.handle(request);
    }
}
