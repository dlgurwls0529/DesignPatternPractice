package Structure.Bridge._01_before;

public class BlackLeewook implements Professor{

    @Override
    public void teach() {
        System.out.println("BlackLeewook does not teach anything");
    }

    @Override
    public void evaluate() {
        System.out.println("BlackLeewook do not evaluate, no test, no homework");
    }

    @Override
    public void move() {
        System.out.println("BlackLeewook does not move. just go baths with friends");
    }
}
