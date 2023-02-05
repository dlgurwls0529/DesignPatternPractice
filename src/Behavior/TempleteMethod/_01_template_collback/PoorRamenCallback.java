package Behavior.TempleteMethod._01_template_collback;

public class PoorRamenCallback implements RamenCallback {
    @Override
    public void putRamen() {
        System.out.println("라면 반으로 쪼개기");
        System.out.println("쪼갠 라면 미리 불려놓기");
        System.out.println("불린 라면 넣기");
        System.out.println("남은 반쪽 창고에 보관하기");
    }
}
