package Structure.Decorator._01_before;

public class Main {
    public static void main(String[] args) {
        new Client(new DefaultCommentService()).writeComment("https://fasd...");
        new Client(new TrimmingCommentService()).writeComment("https://fasd...");
        new Client(new SpamCommentService()).writeComment("https://fasd...");

    }
}
