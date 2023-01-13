package Behavior.ChainOfResponsibility._05_;

public class ClientA {
    public void send() {
        String request = "  S h i i t 1 1 1 1 1 1  ";

        request = new FilterA().handle(request);
        request = new FilterB().handle(request);
        request = new FilterC().handle(request);
        request = new PrintFilter().handle(request);
    }
}
