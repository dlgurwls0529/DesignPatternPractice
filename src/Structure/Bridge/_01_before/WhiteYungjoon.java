package Structure.Bridge._01_before;

public class WhiteYungjoon implements Professor {

    @Override
    public void teach() {
        System.out.println("WhiteYungjoon teaches CSE");
    }

    @Override
    public void evaluate() {
        System.out.println("WhiteYungjoon do not give A+");
    }

    @Override
    public void move() {
        System.out.println("WhiteYungjoon moves very slow");
    }
}
