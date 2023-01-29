package Behavior.Observer._01_after;

public class Main {
    public static void main(String[] args) {
        TempDisplay tempDisplay = new TempDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();
        WindDisplay windDisplay = new WindDisplay();
        WeatherData weatherData = new WeatherData(tempDisplay, humidityDisplay, windDisplay);

        weatherData.changeData("temperature", 19.5f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        weatherData.changeData("temperature", 19.8f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        weatherData.changeData("temperature", 23.00f);
        weatherData.changeData("humidity", 48.37f);
        weatherData.changeData("windVelocity", 4.15f);
    }
}
