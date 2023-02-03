package Behavior.State._01_state_off;

public class Main {
    public static void main(String[] args) {
        Student mang = new Student("mang");
        Student dong = new Student("dong");

        OnlineCourse onlineCourse = new OnlineCourse();
        onlineCourse.setAvailable(mang);

        // 프라이빗으로 바꾸면 맹은 가능, 동은 불가능
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        // 등록 시도
        onlineCourse.addStudent(mang);
        // onlineCourse.addStudent(dong); 이거 예외

        // 리뷰 시도
        onlineCourse.addStudent(mang);
        onlineCourse.addReview("강의 겁나 못하네", mang);
        // onlineCourse.addReview("매번 친절한 강의 감사합니다.", dong); 이거 예외

    }
}
