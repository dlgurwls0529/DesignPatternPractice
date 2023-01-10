package Structure.Decorator._02_after;

public class NoAttendanceDecorator extends LeewookDecorator {

    public NoAttendanceDecorator(Leewook leewook) {
        super(leewook);
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("출석은 없다.");
    }
}
