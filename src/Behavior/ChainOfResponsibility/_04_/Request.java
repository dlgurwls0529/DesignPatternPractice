package Behavior.ChainOfResponsibility._04_;

public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
