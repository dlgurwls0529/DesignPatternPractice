package Behavior.TempleteMethod._01_template_method;

public class NormalRamenChief extends RamenChiefTemplate {
    @Override
    protected void putMushRoom() {
        System.out.println("표고버섯 4개 꺼내기");
        System.out.println("표고버섯 4개 4등분 썰기");
        System.out.println("표고버섯 넣기");
    }

    @Override
    protected void putRamen() {
        System.out.println("라면 넣기");
    }
}
