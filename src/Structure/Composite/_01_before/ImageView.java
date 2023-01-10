package Structure.Composite._01_before;

public class ImageView {

    private int x;
    private int y;

    public ImageView(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int offset_x, int offset_y) {
        this.x += offset_x; this.y += offset_y;
    }

    public String getPositionInfo() {
        return " ImageView : (" + this.x + ", " + this.y + ")";
    }
}
