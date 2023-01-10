package Structure.Decorator._02_before;

public class NoAttendanceLeewook implements Leewook{

    @Override
    public void teach() {
        System.out.println("나는 이욱이다.");
        System.out.println("출석은 없다.");
    }
}
