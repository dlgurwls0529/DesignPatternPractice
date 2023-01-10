package Structure.Decorator._02_after;

public class Client {

    private Leewook leewook;

    private Client(Leewook leewook) {
        this.leewook = leewook;
    }

    public static Client getInstance(Leewook leewook) {
        return new Client(leewook);
    }


    public void operateLeewook() {
        leewook.teach();
    }
}
