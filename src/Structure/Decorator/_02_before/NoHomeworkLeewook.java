package Structure.Decorator._02_before;

public class NoHomeworkLeewook implements Leewook{

    @Override
    public void teach() {
        System.out.println("나는 이욱이다.");
        System.out.println("숙제는 없다.");
    }
}
