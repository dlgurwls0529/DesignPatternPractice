package Behavior.TempleteMethod._01_template_method;

public abstract class RamenChiefTemplate {
    public void cook() {
        System.out.println("냄비 꺼내기");
        System.out.println("물 넣기");
        System.out.println("물 끓이기");
        System.out.println("스프 넣기");

        putMushRoom();

        System.out.println("물 계속 끓이기");

        putRamen();

        System.out.println("5분간 끓이기");
    }

    protected abstract void putMushRoom();

    protected abstract void putRamen();
}
