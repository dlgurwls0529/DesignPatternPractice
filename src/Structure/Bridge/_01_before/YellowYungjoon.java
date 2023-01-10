package Structure.Bridge._01_before;

public class YellowYungjoon implements Professor{

    @Override
    public void teach() {
        System.out.println("YellowYungjoon teaches CSE");
    }

    @Override
    public void evaluate() {
        System.out.println("YellowYungjoon do not give A+");
    }

    @Override
    public void move() {
        System.out.println("YellowYungjoon moves very slow");
    }
}
