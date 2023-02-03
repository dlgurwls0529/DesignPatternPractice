package Behavior.State._01_state_off;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    public enum State {
        DRAFT, PUBLISHED, PRIVATE
    }

    private State state;
    private List<String> reviews;
    private List<Student> students;
    private List<Integer> availableStudents;

    public OnlineCourse() {
        this.state = State.DRAFT;
        this.reviews = new ArrayList<>();
        this.students = new ArrayList<>();
        this.availableStudents = new ArrayList<>();
    }

    public void addReview(String review, Student student) {
        if (state == State.PUBLISHED) {
            // PUBLISHED 상태이면 리뷰를 누구나 달 수 있다.
            reviews.add(review);
        }
        else if (state == State.PRIVATE && students.contains(student)) {
            // PRIVATE 상태이면 등록된 회원만 리뷰 달 수 있음
            reviews.add(review);
        }
        else {
            // DRAFT 상태이거나
            // PRIVATE 인데, 회원이 등록이 안되어있다면
            throw new UnsupportedOperationException("review addition failure!!");
        }
    }

    public void addStudent(Student student) {
        if (state == State.DRAFT || state == State.PUBLISHED) {
            // DRAFT 이거나 PUBLISHED 상태이면 학생 등록 가능
            students.add(student);
        }
        else if (state == State.PRIVATE && isAvailable(student)) {
            // PRIVATE 상태이더라도 쿠폰? 같은 게 있으면 등록이 가능
            students.add(student);
        }
        else {
            // PRIVATE 상태 중에서 학생이 불가능하면 등록 불가능
            throw new UnsupportedOperationException("student addition failure!!!");
        }

        if (students.size() > 1) {
            state = State.PRIVATE;
        }
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public boolean isAvailable(Student student) {
        return availableStudents.contains(student.getId());
    }

    public void setAvailable(Student student) {
        if(!isAvailable(student)) {
            availableStudents.add(student.getId());
        }
    }

    public void setUnAvailable(Student student) {
        if(isAvailable(student)) {
            availableStudents.remove(student.getId());
        }
    }

    public List<String> getReviews() {
        return new ArrayList<>(reviews);
    }
}
