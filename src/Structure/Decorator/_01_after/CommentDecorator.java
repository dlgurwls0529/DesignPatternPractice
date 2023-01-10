package Structure.Decorator._01_after;

public abstract class CommentDecorator implements CommentService{

    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
