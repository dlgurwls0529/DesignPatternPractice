package Behavior.State._01_state_on;

public class Main {
    public static void main(String[] args) {
        // 상태 패턴은 팩토리 메소드 패턴과 비슷하다
        // 정적 팩토리의 if 절에 의한 생성 객체 분기에 따라 생성하던 것을, 하위 클래스에 위임했듯이
        // 상태 패턴도 if 절에 의한 상태 분기에 따라 수행할 작업을 위임한다.

        Student mang = new Student("mang");
        Student dong = new Student("dong");

        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.setAvailable(mang);

        // 프라이빗으로 바꾸면 맹은 가능, 동은 불가능
        onlineCourse.changeState(new Private());

        // 등록 시도
        onlineCourse.addStudent(mang);
        // onlineCourse.addStudent(dong); 이거 예외

        // 리뷰 시도
        onlineCourse.addStudent(mang);
        onlineCourse.addReview("very bad", mang);
        // onlineCourse.addReview("매번 친절한 강의 감사합니다.", dong); 이거 예외

    }
}
