package Behavior.ChainOfResponsibility._06_;

public class FilterC extends Filter {
    public FilterC(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        super.handle(request.replace("1", "2"));
    }
}
