package Structure.Bridge._01_before;

public class BlackYunki implements Professor{

    @Override
    public void teach() {
        System.out.println("BlackYunki teaches management");
    }

    @Override
    public void evaluate() {
        System.out.println("BlackYunki give many A+");
    }

    @Override
    public void move() {
        System.out.println("BlackYunki moves very fast");
    }
}
