package Behavior.State._01_state_on;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class OnlineCourse {
    private State state;
    private List<String> reviews;
    private List<Student> students;
    private List<Integer> availableStudents;

    public OnlineCourse() {
        changeState(new Draft());
        this.reviews = new ArrayList<>();
        this.students = new ArrayList<>();
        this.availableStudents = new ArrayList<>();
    }

    public void addReview(String review, Student student) {
        /* 순환 호출 상황
        Method: addReview(State)
        -- 여기에서는 내부에 있는 review 리스트에 직접 접근한다. --
        Method: getStackTrace
        Method: addReview(OnlineCourse)
        Method: ~~
        Method: addReview(State)
        -- 여기에서는 그대로 간다. --
        Method: getStackTrace
        Method: addReview(OnlineCourse)
        Method: main  // main 에서 처음 호출했을 때, 배열 마지막
         */

        /* State 의 addReview 를 호출해야 하는 경우
        Method: [0]getStackTrace
        Method: [1]addReview(OnlineCourse)
        Method: [2]main
         */

        /* 내부에 있는 리스트에 직접 접근해야 하는 경우
        Method: [0]getStackTrace
        Method: [1]addReview(OnlineCourse)
        Method: [k개]~~
        Method: [k+2]addReview(State)
        Method: [k+3]getStackTrace
        Method: [k+4]addReview(OnlineCourse)
        Method: [k+5]main
         */

        // State 가 콜스택에 있다면
        if(isStateInterfaceCalled()) {
            reviews.add(review);
        }
        else {
            state.addReview(this, review, student);
        }
    }

    public void addStudent(Student student) {
        // State 가 콜스택에 있다면
        if(isStateInterfaceCalled()) {
            students.add(student);
        }
        else {
            state.addStudent(this, student);
        }
    }

    public boolean isAdded(Student student) {
        return students.contains(student);
    }

    public int getReviewSize() {
        return reviews.size();
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

    private boolean isStateInterfaceCalled() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String targetCallerClassName = "Behavior.State._01_state_on.State";

        boolean found = false;
        // 호출 스택 순회
        for(StackTraceElement s : stackTraceElements) {
            // 현재 호출자 클래스의 인터페이스들 순회
            try {
                Class<?>[] cs = Class.forName(s.getClassName()).getInterfaces();
                for(Class<?> c : cs) {
                    if (c.getName().equals(targetCallerClassName)) {
                        found = true;
                        break;
                    }
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }

            if (found) {
                break;
            }
        }

        return found;
    }
}
