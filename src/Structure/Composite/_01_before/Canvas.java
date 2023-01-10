package Structure.Composite._01_before;

public class Canvas {

    private int x;
    private int y;

    private Button button;
    private ImageView imageView;
    private TextView textView;

    public Canvas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addButton(Button button) {
        this.button = button;
    }

    public void addImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public void addTextView(TextView textView) {
        this.textView = textView;
    }

    public void move(int offset_x, int offset_y) {
        this.x += offset_x; this.y += offset_y;
        button.move(offset_x, offset_y);
        imageView.move(offset_x, offset_y);
        textView.move(offset_x, offset_y);
    }

    public String getPositionInfo() {
        return " Canvas : (" + this.x + ", " + this.y + ")"
                + button.getPositionInfo()
                + imageView.getPositionInfo()
                + textView.getPositionInfo();
    }
}
