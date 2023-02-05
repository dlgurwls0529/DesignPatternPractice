package Behavior.TempleteMethod._01_template_collback;

public class PoorMushRoomCallback implements MushRoomCallback {
    @Override
    public void putMushRoom() {
        System.out.println("썩은 표고버섯 1개 꺼내기");
        System.out.println("표고버섯 1개 8등분 썰기");
        System.out.println("표고버섯 넣기");
        System.out.println("썩은 양송이버섯 1개 꺼내기");
        System.out.println("양송이버섯 넣기");
    }
}
