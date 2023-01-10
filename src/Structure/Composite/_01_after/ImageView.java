package Structure.Composite._01_after;

public class ImageView implements UI {

    private int x;
    private int y;

    public ImageView(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int offset_x, int offset_y) {
        this.x += offset_x; this.y += offset_y;
    }

    @Override
    public String getPositionInfo() {
        return " ImageView : (" + this.x + ", " + this.y + ")";
    }
}
