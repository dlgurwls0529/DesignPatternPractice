package Behavior.ChainOfResponsibility._06_;

public class ClientC {
    public void send() {
        String request = "  S h i i t 1 1 1 1 1 1  ";
        ChainContainer.getLoginChainFilter().handle(request);
    }
}
