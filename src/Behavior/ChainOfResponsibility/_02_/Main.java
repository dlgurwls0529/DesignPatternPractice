package Behavior.ChainOfResponsibility._02_;

public class Main {
    public static void main(String[] args) {
        ClientA clientA = new ClientA();
        ClientB clientB = new ClientB();
        ClientC clientC = new ClientC();

        clientA.work();
        clientB.work();
        clientC.work();
    }
}
