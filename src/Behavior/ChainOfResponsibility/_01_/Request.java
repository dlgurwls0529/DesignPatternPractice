package Behavior.ChainOfResponsibility._01_;

public class Request {

    private final String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
