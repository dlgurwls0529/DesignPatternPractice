package Behavior.ChainOfResponsibility._05_;

import java.util.Locale;

public class FilterA implements Filter{
    @Override
    public String handle(String request) {
        return request.toUpperCase(Locale.ROOT);
    }
}
