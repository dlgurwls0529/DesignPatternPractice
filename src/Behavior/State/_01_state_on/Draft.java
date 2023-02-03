package Behavior.State._01_state_on;

public class Draft implements State {
    @Override
    public void addStudent(OnlineCourse o, Student student) {
        o.addStudent(student);
        System.out.println(student.getName() + " : " + Message.addStudentSucceed);
    }

    @Override
    public void addReview(OnlineCourse o, String review, Student student) {
        System.out.println(review + " : " + Message.addReviewFailure);
        if (o.getReviewSize() > 1) {
            o.changeState(new Private());
        }
    }
}
