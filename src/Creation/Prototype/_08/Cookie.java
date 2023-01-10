package Creation.Prototype._08;

public class Cookie implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cookie cookie = (Cookie) super.clone();
        return cookie;
    }
}
