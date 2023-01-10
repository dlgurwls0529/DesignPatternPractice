package Structure.Decorator._02_after;

public class NoTestDecorator extends LeewookDecorator{

    public NoTestDecorator(Leewook leewook) {
        super(leewook);
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("시험은 없다.");
    }
}
