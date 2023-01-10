package Creation.Prototype._07;

public class Cookie implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cookie cookie = new Cookie();
        return cookie;
    }
}
