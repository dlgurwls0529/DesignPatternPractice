package Creation.Builder.SequentialBuilder;

public class ConcreteBuilder implements StepABuilder, StepBBuilder, StepCBuilder, Builder{

    Object fieldA;
    Object fieldB;
    Object fieldC;

    @Override
    public Product build() {
        if(fieldA == null || fieldB == null || fieldC == null) {
            throw new IllegalArgumentException();
        }
        return new Product(fieldA, fieldB, fieldC);
    }

    @Override
    public StepBBuilder stepA(Object fieldA) {
        this.fieldA = fieldA;
        return this;
    }

    @Override
    public StepCBuilder stepB(Object fieldB) {
        this.fieldB = fieldB;
        return this;
    }

    @Override
    public Builder stepC(Object fieldC) {
        this.fieldC = fieldC;
        return this;
    }
}
