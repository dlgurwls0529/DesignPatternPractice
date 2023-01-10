package Creation.Factory.BasicFactory;

public abstract class DefaultTurtle implements Turtle {

    private int size;
    private String name;
    private int cubicAmount;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCubicAmount() {
        return cubicAmount;
    }

    public void setCubicAmount(int cubicAmount) {
        this.cubicAmount = cubicAmount;
    }
}
