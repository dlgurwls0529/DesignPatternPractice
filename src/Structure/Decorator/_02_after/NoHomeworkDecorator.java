package Structure.Decorator._02_after;

public class NoHomeworkDecorator extends LeewookDecorator{

    public NoHomeworkDecorator(Leewook leewook) {
        super(leewook);
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("숙제는 없다.");
    }
}
