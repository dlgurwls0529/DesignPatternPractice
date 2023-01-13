package Behavior.ChainOfResponsibility._05_;

public class FilterC implements Filter {
    @Override
    public String handle(String request) {
        return request.replace("1", "2");
    }
}
