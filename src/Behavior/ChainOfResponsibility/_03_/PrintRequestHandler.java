package Behavior.ChainOfResponsibility._03_;

public class PrintRequestHandler extends RequestHandler {

    protected PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
