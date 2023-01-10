package Behavior.ChainOfResponsibility._04_;

public abstract class RequestHandler {

    private final RequestHandler requestHandler;

    protected RequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void handle(Request request) {
        if(requestHandler != null) {
            requestHandler.handle(request);
        }
    }
}
