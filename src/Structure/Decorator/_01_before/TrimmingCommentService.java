package Structure.Decorator._01_before;

public class TrimmingCommentService extends DefaultCommentService{

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String str) {
        return str.replace("...", "");
    }
}
