package Behavior.ChainOfResponsibility._04_;

public class PrintRequestHandler extends RequestHandler {

    protected PrintRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
