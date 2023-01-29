package Behavior.Observer._01_after;

import java.util.HashMap;
import java.util.Map;

public class WeatherData {
    private final Map<String, Float> currentWeatherState;
    private final TempDisplay tempDisplay;
    private final HumidityDisplay humidityDisplay;
    private final WindDisplay windDisplay;

    public WeatherData(TempDisplay tempDisplay, HumidityDisplay humidityDisplay, WindDisplay windDisplay) {
        this.currentWeatherState = new HashMap<String, Float>();
        this.tempDisplay = tempDisplay;
        this.humidityDisplay = humidityDisplay;
        this.windDisplay = windDisplay;
    }

    public void changeData(String topic, float data) {
        if(currentWeatherState.containsKey(topic)) {
            currentWeatherState.replace(topic, data);
        }
        else {
            currentWeatherState.put(topic, data);
        }

        topicDataChanged(topic);
    }

    private void topicDataChanged(String topic) {
        switch (topic) {
            case "temperature":
                tempDisplay.display(currentWeatherState.get("temperature"));
                break;
            case "humidity":
                humidityDisplay.display(currentWeatherState.get("humidity"));
                break;
            case "windVelocity":
                humidityDisplay.display(currentWeatherState.get("windVelocity"));
                break;
            default:
                break;
        }
    }
}
