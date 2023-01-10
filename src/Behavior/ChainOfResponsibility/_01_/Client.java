package Behavior.ChainOfResponsibility._01_;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("자퇴하고싶다.");
        RequestHandler requestHandler = new RequestHandler();
        requestHandler.handler(request);
    }
}
