package Behavior.ChainOfResponsibility._04_;

import java.util.Locale;

public class LowerRequestHandler extends RequestHandler {

    protected LowerRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("요청을 소문자로 변환합니다.");
        request.setBody(request.getBody().toLowerCase(Locale.ROOT));
        super.handle(request);
    }
}
