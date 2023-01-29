package Behavior.Observer._01_advanced;

public class TempDisplay implements Display {
    @Override
    public void update(float data) {
        System.out.println("current temperature : " + data);
    }
}
