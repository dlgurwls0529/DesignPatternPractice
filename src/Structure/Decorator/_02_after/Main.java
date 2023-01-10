package Structure.Decorator._02_after;

public class Main {
    public static void main(String[] args) {
        Leewook defaultLeewook = new DefaultLeewook();
        Client client = Client.getInstance(defaultLeewook);
        client.operateLeewook();

        Leewook noHomeworkLeewook = new NoHomeworkDecorator(defaultLeewook);
        client = Client.getInstance(noHomeworkLeewook);
        client.operateLeewook();

        Leewook noHomeworkNoTestLeewook = new NoTestDecorator(noHomeworkLeewook);
        client = Client.getInstance(noHomeworkNoTestLeewook);
        client.operateLeewook();

        Leewook noHomeworkNoTestNoAttendanceLeewook = new NoAttendanceDecorator(noHomeworkNoTestLeewook);
        client = Client.getInstance(noHomeworkNoTestNoAttendanceLeewook);
        client.operateLeewook();
    }
}
