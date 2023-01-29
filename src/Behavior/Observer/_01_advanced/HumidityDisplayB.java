package Behavior.Observer._01_advanced;

public class HumidityDisplayB implements Display {
    @Override
    public void update(float data) {
        System.out.println("humidity is " + data + "%");
    }
}
