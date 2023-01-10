package Behavior.ChainOfResponsibility._03_;

public abstract class RequestHandler {

    private final RequestHandler nextHandler;

    protected RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
