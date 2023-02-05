package Behavior.TempleteMethod._01_template_method;

public class PigRamenChief extends RamenChiefTemplate {
    @Override
    protected void putMushRoom() {
        System.out.println("표고버섯 8개 꺼내기");
        System.out.println("표고버섯 8개 3등분 썰기");
        System.out.println("표고버섯 넣기");
        System.out.println("황제버섯 1개 꺼내기");
        System.out.println("큼지막하게 원판처럼 썰기");
        System.out.println("황제버섯 넣기");
    }

    @Override
    protected void putRamen() {
        System.out.println("라면 넣기");
        System.out.println("라면 넣기");
        System.out.println("라면 넣기");
        System.out.println("라면 넣기");
        System.out.println("라면 넣기");
    }
}
