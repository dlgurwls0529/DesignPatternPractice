package Behavior.Iterator._01_after;

public class Post {
    private final String title;
    private final long time;
    private static int counter;

    public Post(String title) {
        this.title = title;
        this.time = counter++;
    }

    public String getTitle() {
        return title;
    }

    public long createdTime() {
        return time;
    }
}
