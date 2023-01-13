package Behavior.ChainOfResponsibility._05_;

public class FilterB implements Filter {
    @Override
    public String handle(String request) {
        return request.trim();
    }
}
