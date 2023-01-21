package Behavior.Iterator._01_after;

import java.util.ArrayList;
import java.util.List;

public class DefaultPostIterator implements Iterator {

    private final List<Post> li;
    private int cursor;

    public DefaultPostIterator(List<Post> li) {
        this.li = new ArrayList<>(li);
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor != li.size();
    }

    @Override
    public Object next() {
        return li.get(cursor++);
    }
}
