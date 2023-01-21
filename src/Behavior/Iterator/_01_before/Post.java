package Behavior.Iterator._01_before;

public class Post {
    private final String title;
    private final long time;

    public Post(String title) {
        this.title = title;
        this.time = System.currentTimeMillis();
    }

    public String getTitle() {
        return title;
    }

    public long createdTime() {
        return time;
    }
}
