package Structure.Decorator._01_after;

public class SpamDecorator extends CommentDecorator {

    public SpamDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(!isSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String str) {
        return str.contains("https://");
    }
}
