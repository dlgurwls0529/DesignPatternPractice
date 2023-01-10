package Structure.Composite._01_before;

public class TextView {

    private int x;
    private int y;

    public TextView(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int offset_x, int offset_y) {
        this.x += offset_x; this.y += offset_y;
    }

    public String getPositionInfo() {
        return " TextView : (" + this.x + ", " + this.y + ")";
    }
}
