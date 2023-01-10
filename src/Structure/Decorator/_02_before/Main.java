package Structure.Decorator._02_before;

public class Main {
    public static void main(String[] args) {
        Leewook defaultLeewook = new DefaultLeewook();
        Client client = Client.getInstance(defaultLeewook);
        client.operateLeewook();

        Leewook noTestLeewook = new NoTestLeewook();
        client = Client.getInstance(noTestLeewook);
        client.operateLeewook();

        Leewook noHomeworkLeewook = new NoHomeworkLeewook();
        client = Client.getInstance(noHomeworkLeewook);
        client.operateLeewook();

        Leewook noAttendanceLeewook = new NoAttendanceLeewook();
        client = Client.getInstance(noAttendanceLeewook);
        client.operateLeewook();

        Leewook noTestNoHomeworkLeewook = new NoTestNoHomeworkLeewook();
        client = Client.getInstance(noTestNoHomeworkLeewook);
        client.operateLeewook();
    }
}
