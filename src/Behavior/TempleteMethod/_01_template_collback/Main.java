package Behavior.TempleteMethod._01_template_collback;

public class Main {
    public static void main(String[] args) {
        RamenChiefTemplate ramenChiefTemplate = new RamenChiefTemplate();
        ramenChiefTemplate.cook(
            new MushRoomCallback() {
                @Override
                public void putMushRoom() {
                    System.out.println("송로버섯 3개 꺼내기");
                    System.out.println("송로버섯 3개 6등분 썰기");
                    System.out.println("송로버섯 넣기");
                }
            },
            new RamenCallback() {
                @Override
                public void putRamen() {
                    System.out.println("라면에 금가루 칠하기");
                    System.out.println("라면 넣기");
                }
            }
        );

        ramenChiefTemplate.cook(
                new NormalMushRoomCallback(),
                new RamenCallback() {
                    @Override
                    public void putRamen() {
                        System.out.println("라면에 금가루 칠하기");
                        System.out.println("라면 넣기");
                    }
                }
        );

        ramenChiefTemplate.cook(
                new LuxuryMushRoomCallback(),
                new PigRamenCallback()
        );
    }
}
