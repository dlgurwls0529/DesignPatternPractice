package Structure.FlyWeight._01_after;

public class Character {

    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    public char getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public Font getFont() {
        return font;
    }
}
