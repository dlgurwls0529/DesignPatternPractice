package Structure.FlyWeight._01_after;

public final class Font {

    private final String fontName;
    private final int fontSize;

    public Font(String fontName, int fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
