package Creation.Factory.Example;

public abstract class Ship {
    private String name;
    private String color;
    private int number;

    // 색, 이름, 숫자 말고 다른 것을 정의하는 배가 있을 수 있으니
    // (구상 클래스에서 새로 정의한 필드)
    // 이 메서드는 추상메서드로 선언한다.
    abstract void checkAttribute();

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
