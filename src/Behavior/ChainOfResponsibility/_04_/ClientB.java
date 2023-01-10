package Behavior.ChainOfResponsibility._04_;

public class ClientB implements Client {

    @Override
    public void work() {
        Request request = new Request("this is REQUEST:");
        RequestHandler requestHandler = RequestHandlerContainer.getChainedRequestHandler();
        requestHandler.handle(request);
    }
}
