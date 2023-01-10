package Structure.Decorator._01_before;

public class SpamCommentService extends DefaultCommentService{

    @Override
    public void addComment(String comment) {
        if(!isSpam(comment)) {
            System.out.println(comment);
        }
    }

    private boolean isSpam(String str) {
        return str.contains("https://");
    }
}
