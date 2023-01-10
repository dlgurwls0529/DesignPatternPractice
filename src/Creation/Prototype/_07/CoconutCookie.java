package Creation.Prototype._07;

public class CoconutCookie extends Cookie{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CoconutCookie coconutCookie = new CoconutCookie();
        return coconutCookie;
    }
}
