package Behavior.TempleteMethod._01_template_collback;

public class LuxuryRamenCallback implements RamenCallback {
    @Override
    public void putRamen() {
        System.out.println("라면에 금가루 칠하기");
        System.out.println("라면 넣기");
    }
}
