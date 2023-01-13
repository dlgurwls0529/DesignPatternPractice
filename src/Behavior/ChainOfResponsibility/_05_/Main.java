package Behavior.ChainOfResponsibility._05_;

public class Main {
    public static void main(String[] args) {
        System.out.println("뿌직");

        ClientA clientA = new ClientA();
        clientA.send();

        ClientB clientB = new ClientB();
        clientB.send();

        ClientC clientC = new ClientC();
        clientC.send();
    }
}
