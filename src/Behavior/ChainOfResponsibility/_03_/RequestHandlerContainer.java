package Behavior.ChainOfResponsibility._03_;

public class RequestHandlerContainer {

    public static RequestHandler getRequestHandler() {
        return new AuthRequestHandler(
                new LoggingRequestHandler(
                        new PrintRequestHandler(null)
                )
        );

    }
}
