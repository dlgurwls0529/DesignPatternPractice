package Behavior.Iterator._01_after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RecentPostIterator implements Iterator {

    private final List<Post> li;
    private int cursor;

    public RecentPostIterator(List<Post> li) {
        this.li = new ArrayList<>(li);
        this.li.sort(new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return (int) (o2.createdTime() - o1.createdTime());
            }
        });
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != li.size();
    }

    @Override
    public Object next() {
        return this.li.get(cursor++);
    }
}
