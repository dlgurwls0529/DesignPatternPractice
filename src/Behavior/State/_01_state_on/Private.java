package Behavior.State._01_state_on;

public class Private implements State {
    @Override
    public void addStudent(OnlineCourse o, Student student) {
        if(o.isAvailable(student)) {
            o.addStudent(student);
            System.out.println(
                student.getName() + " : " + Message.addStudentSucceed
            );
        }
        else {
            System.out.println(
                student.getName() + " : " + Message.addStudentFailure
            );
        }
    }

    @Override
    public void addReview(OnlineCourse o, String review, Student student) {
        if(o.isAdded(student)) {
            o.addReview(review, student);
            System.out.println(
                    review + " : " + Message.addReviewSucceed
            );
        }
        else {
            System.out.println(
                    review + " : " + Message.addReviewFailure
            );
        }
    }
}
