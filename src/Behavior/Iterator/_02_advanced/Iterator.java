package Behavior.Iterator._02_advanced;

public interface Iterator {
    public boolean hasNext();
    public boolean hasPrev();
    public void set(Object o);
    public void remove();
    public Object next();
    public Object prev();
    public int getCursor();
}
