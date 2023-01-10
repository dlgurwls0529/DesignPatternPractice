package Structure.Decorator._02_after;

public class LeewookDecorator implements Leewook{

    private Leewook leewook;

    public LeewookDecorator(Leewook leewook) {
        this.leewook = leewook;
    }

    @Override
    public void teach() {
        System.out.println("나는 이욱이다.");
    }
}
