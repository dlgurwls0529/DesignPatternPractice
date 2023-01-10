package Structure.Bridge._01_before;

public class RedYunki implements Professor{

    @Override
    public void teach() {
        System.out.println("RedYunki teaches management");
    }

    @Override
    public void evaluate() {
        System.out.println("RedYunki give many A+");
    }

    @Override
    public void move() {
        System.out.println("RedYunki moves faster");
    }
}
