package Behavior.State._01_state_on;


public class Published implements State {
    @Override
    public void addStudent(OnlineCourse o, Student student) {
        o.addStudent(student);
        System.out.println(student.getName() + " : " + Message.addStudentSucceed);
    }

    @Override
    public void addReview(OnlineCourse o, String review, Student student) {
        o.addReview(review, student);
        System.out.println(review + " : " + Message.addReviewSucceed);
    }
}