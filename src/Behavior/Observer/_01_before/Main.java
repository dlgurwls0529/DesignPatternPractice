package Behavior.Observer._01_before;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TempDisplay tempDisplay = new TempDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        WindDisplay windDisplay = new WindDisplay(weatherData);

        weatherData.changeData("temperature", 19.5f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        tempDisplay.display();
        humidityDisplay.display();
        windDisplay.display();

        weatherData.changeData("temperature", 19.8f);
        weatherData.changeData("humidity", 56.76f);
        weatherData.changeData("windVelocity", 3.77f);

        tempDisplay.display();
        humidityDisplay.display();
        windDisplay.display();

        weatherData.changeData("temperature", 23.00f);
        weatherData.changeData("humidity", 48.37f);
        weatherData.changeData("windVelocity", 4.15f);

        tempDisplay.display();
        humidityDisplay.display();
        windDisplay.display();
    }
}
