package Structure.Facade._01_after;

public class Facade {

    private final SubSystem1 subSystem1;
    private final SubSystem2 subSystem2;
    private final SubSystem3 subSystem3;
    private final SubSystem4 subSystem4;


    public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
        subSystem4 = new SubSystem4();
    }

    public void mixOperation1() {
        subSystem1.operation();
        subSystem3.operation();
    }

    public void mixOperation2() {
        subSystem2.operation();
        subSystem4.operation();
    }
}
