package Behavior.ChainOfResponsibility._06_;

public class FilterB extends Filter {
    public FilterB(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        super.handle(request.trim());
    }
}
