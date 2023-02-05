package Behavior.TempleteMethod._01_template_collback;

public class RamenChiefTemplate {
    public void cook(MushRoomCallback mushRoomCallback, RamenCallback ramenCallback) {
        System.out.println("냄비 꺼내기");
        System.out.println("물 넣기");
        System.out.println("물 끓이기");
        System.out.println("스프 넣기");

        mushRoomCallback.putMushRoom();

        System.out.println("물 계속 끓이기");

        ramenCallback.putRamen();

        System.out.println("5분간 끓이기");
    }
}
