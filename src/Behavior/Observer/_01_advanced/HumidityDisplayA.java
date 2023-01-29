package Behavior.Observer._01_advanced;

public class HumidityDisplayA implements Display {
    @Override
    public void update(float data) {
        System.out.println("current humidity : " + data);
    }
}
