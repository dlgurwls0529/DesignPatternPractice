package Behavior.Observer._01_before;

public class TempDisplay {
    private final WeatherData weatherData;

    public TempDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void display() {
        try {
            float data = weatherData.getWeatherState("temperature");
            System.out.println("current temperature : " + data);
        } catch (IllegalArgumentException e) {
            System.out.println("no temperature data");
        }
    }
}
