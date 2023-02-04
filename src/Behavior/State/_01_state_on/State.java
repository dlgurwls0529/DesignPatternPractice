package Behavior.State._01_state_on;

public interface State {
    // 컨텍스트는 여러번 쓰일 테니까 위임 아니고
    // 연관으로 하자.
    // 쓰일 Context 를 거기에서 주입받아 사용
    public void addStudent(OnlineCourse o, Student student);
    public void addReview(OnlineCourse o, String review, Student student);
}
