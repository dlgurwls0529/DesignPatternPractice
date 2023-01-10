package Creation.Prototype._01;

public class Ship implements Cloneable{

    /*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */

    public Ship clone(){
        try{
            return (Ship)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
