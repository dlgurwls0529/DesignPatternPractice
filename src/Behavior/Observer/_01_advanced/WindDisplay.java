package Behavior.Observer._01_advanced;

public class WindDisplay implements Display {
    @Override
    public void update(float data) {
        System.out.println("current wind velocity : " + data);
    }
}
