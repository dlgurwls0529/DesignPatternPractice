package Behavior.Iterator._01_after;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Post> posts;

    public Board() {
        this.posts = new ArrayList<>();
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addBoard(String title) {
        Post post = new Post(title);
        posts.add(post);
    }

    public Iterator getIterator() {
        return new RecentPostIterator(posts);
    }
}
