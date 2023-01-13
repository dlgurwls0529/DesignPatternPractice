package Behavior.ChainOfResponsibility._06_;

public abstract class Filter {

    private final Filter nextFilter;

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public void handle(String request) {
        if(nextFilter != null) {
            nextFilter.handle(request);
        }
    }
}
