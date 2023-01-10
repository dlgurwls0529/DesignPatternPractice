package Structure.Decorator._01_after;

public class Main {
    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        Client client = new Client(commentService);
        client.writeComment("https://fsafd...");

        commentService = new TrimmingDecorator(commentService);
        client = new Client(commentService);
        client.writeComment("https://fsafd...");

        commentService = new SpamDecorator(commentService);
        client = new Client(commentService);
        client.writeComment("https://fsafd...");
    }
}
