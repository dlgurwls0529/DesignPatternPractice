package Behavior.ChainOfResponsibility._04_;

public class Main {
    public static void main(String[] args) {
        new ClientA().work();
        new ClientB().work();
        new ClientC().work();
    }
}
