package Behavior.ChainOfResponsibility._06_;

public class ChainContainer {
    public static Filter getRegisterChainFilter() {
        return new FilterA(new FilterB(new FilterC(
                new PrintFilter(null)
        )));
    }

    public static Filter getLoginChainFilter() {
        return new FilterA(new FilterC(
                new PrintFilter(null)
        ));
    }
}
