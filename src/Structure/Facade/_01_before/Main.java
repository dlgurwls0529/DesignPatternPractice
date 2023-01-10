package Structure.Facade._01_before;

public class Main {
    public static void main(String[] args) {
        SubSystem1 subSystem1 = new SubSystem1();
        SubSystem2 subSystem2 = new SubSystem2();
        SubSystem3 subSystem3 = new SubSystem3();
        SubSystem4 subSystem4 = new SubSystem4();

        subSystem1.operation();
        subSystem2.operation();
        subSystem3.operation();
        subSystem4.operation();
    }
}
