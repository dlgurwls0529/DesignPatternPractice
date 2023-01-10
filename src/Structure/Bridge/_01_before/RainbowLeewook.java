package Structure.Bridge._01_before;

public class RainbowLeewook implements Professor{

    @Override
    public void teach() {
        System.out.println("RainbowLeewook does not teach anything");
    }

    @Override
    public void evaluate() {
        System.out.println("RainbowLeewook do not evaluate, no test, no homework");
    }

    @Override
    public void move() {
        System.out.println("RainbowLeewook does not move. just go baths with friends");
    }
}
