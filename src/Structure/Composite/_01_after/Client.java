package Structure.Composite._01_after;

public class Client {
    public static void main(String[] args) {
        UI canvas = new Canvas(3, 2);
        UI button = new Button(1, 2);
        UI imageView = new ImageView(3, 3);
        UI textView = new TextView(3, 3);
        UI canvas1 = new Canvas(4, 4);

        ((Canvas)canvas).addComponent(button);
        ((Canvas)canvas).addComponent(imageView);
        ((Canvas)canvas).addComponent(textView);
        ((Canvas)canvas).addComponent(canvas1);

        System.out.println(canvas.getPositionInfo());

        button.move(1, 1);
        canvas.move(1, 1);

        System.out.println(canvas.getPositionInfo());

        UI button1 = new Button(4, 10);
        ((Canvas)canvas1).addComponent(button1);

        System.out.println(canvas.getPositionInfo());


    }
}
