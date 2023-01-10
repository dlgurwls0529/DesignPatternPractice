package Creation.Prototype._02;

// 자바에서는 Cloneable 상속 안하면 예외 던진다.
// clone 메소드에서 확인하는 것이다.
public class Car implements Cloneable{
    private String color;
    private String name;
    private String speed;

    /*protected Object clone() {
        // 아래처럼 하면 순환참조이다.
        // return (Car) this.clone();
        return (Car) super.clone();
    }
    */

    public Car clone(String s) {
        try {
            return (Car)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 굳이 Object 에서 상속할 필요는 없다.
    /*
    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
*/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
