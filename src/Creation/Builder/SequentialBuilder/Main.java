package Creation.Builder.SequentialBuilder;

public class Main {
    public static void main(String[] args) {
        Product product = new ConcreteBuilder()
                .stepA("A")
                .stepB("B")
                .stepC("C")
                .build();

    }
}
