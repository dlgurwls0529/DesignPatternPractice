package Behavior.ChainOfResponsibility._04_;

public class RequestHandlerContainer {
    public static RequestHandler getChainedRequestHandler() {
        return new AuthRequestHandler(new LowerRequestHandler(new LimitRequestHandler(new TrimRequestHandler(
                new PrintRequestHandler(null)
        ), 20)));
    }
}
