package Behavior.Observer._01_before;

public class WindDisplay {
    private final WeatherData weatherData;

    public WindDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void display() {
        try {
            float data = weatherData.getWeatherState("windVelocity");
            System.out.println("current wind velocity : " + data);
        }
        catch (IllegalArgumentException e) {
            System.out.println("no wind velocity data");
        }
    }
}
