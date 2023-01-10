package Structure.Composite._01_before;

public class Client {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(3, 2);
        Button button = new Button(1, 2);
        ImageView imageView = new ImageView(3, 3);
        TextView textView = new TextView(3, 3);

        canvas.addButton(button);
        canvas.addImageView(imageView);
        canvas.addTextView(textView);

        System.out.println(canvas.getPositionInfo());

        button.move(1, 1);
        canvas.move(1, 1);

        System.out.println(canvas.getPositionInfo());


    }
}
