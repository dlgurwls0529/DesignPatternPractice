package Behavior.TempleteMethod._01_template_method;

public class PoorRamenChief extends RamenChiefTemplate {
    @Override
    protected void putMushRoom() {
        System.out.println("썩은 표고버섯 1개 꺼내기");
        System.out.println("표고버섯 1개 8등분 썰기");
        System.out.println("표고버섯 넣기");
        System.out.println("썩은 양송이버섯 1개 꺼내기");
        System.out.println("양송이버섯 넣기");
    }

    @Override
    protected void putRamen() {
        System.out.println("라면 반으로 쪼개기");
        System.out.println("쪼갠 라면 미리 불려놓기");
        System.out.println("불린 라면 넣기");
        System.out.println("남은 반쪽 창고에 보관하기");
    }
}
