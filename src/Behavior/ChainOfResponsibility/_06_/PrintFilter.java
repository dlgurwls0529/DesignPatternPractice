package Behavior.ChainOfResponsibility._06_;

public class PrintFilter extends Filter {
    public PrintFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        System.out.println(request);
        super.handle(request);
    }
}
