package Behavior.ChainOfResponsibility._05_;

public class PrintFilter implements Filter {
    @Override
    public String handle(String request) {
        System.out.println(request);
        return null;
    }
}
