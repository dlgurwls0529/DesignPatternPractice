package Behavior.Observer._01_advanced;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TempDisplay tempDisplay = new TempDisplay();
        HumidityDisplayA humidityDisplayA = new HumidityDisplayA();
        HumidityDisplayB humidityDisplayB = new HumidityDisplayB();
        WindDisplay windDisplay = new WindDisplay();

        weatherData.addDisplay("temperature", tempDisplay);
        weatherData.addDisplay("humidity", humidityDisplayA);
        weatherData.addDisplay("humidity", humidityDisplayB);
        weatherData.addDisplay("windVelocity", windDisplay);

        weatherData.changeData("temperature", 19.5f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        weatherData.removeDisplay(humidityDisplayB);

        weatherData.changeData("temperature", 19.8f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        weatherData.removeDisplay(windDisplay);

        weatherData.changeData("temperature", 23.00f);
        weatherData.changeData("humidity", 48.37f);
        weatherData.changeData("windVelocity", 4.15f);
    }
}
