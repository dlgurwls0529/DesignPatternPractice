package Behavior.ChainOfResponsibility._06_;

import java.util.Locale;

public class FilterA extends Filter {
    public FilterA(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public void handle(String request) {
        super.handle(request.toUpperCase(Locale.ROOT));
    }
}
