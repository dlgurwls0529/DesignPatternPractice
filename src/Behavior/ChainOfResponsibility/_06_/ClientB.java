package Behavior.ChainOfResponsibility._06_;

public class ClientB {
    public void send() {
        String request = "  S h i i t 1 1 1 1 1 1   ";
        ChainContainer.getRegisterChainFilter().handle(request);
    }
}
