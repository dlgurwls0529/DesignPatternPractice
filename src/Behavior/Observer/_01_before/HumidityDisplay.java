package Behavior.Observer._01_before;

public class HumidityDisplay {
    private final WeatherData weatherData;

    public HumidityDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void display() {
        try {
            float data = weatherData.getWeatherState("humidity");
            System.out.println("current humidity : " + data);
        }
        catch (IllegalArgumentException e) {
            System.out.println("no humidity data");
        }
    }
}
