package Structure.Decorator._02_before;

public class NoTestNoAttendanceLeewook implements Leewook{

    @Override
    public void teach() {
        System.out.println("나는 이욱이다.");
        System.out.println("시험은 없다.");
        System.out.println("출석은 없다.");
    }
}
