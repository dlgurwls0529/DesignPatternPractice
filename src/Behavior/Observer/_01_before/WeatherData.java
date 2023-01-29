package Behavior.Observer._01_before;

import java.util.HashMap;
import java.util.Map;

public class WeatherData {
    private final Map<String, Float> currentWeatherState;

    public WeatherData() {
        this.currentWeatherState = new HashMap<String, Float>();
    }

    public void changeData(String topic, float data) {
        if(currentWeatherState.containsKey(topic)) {
            currentWeatherState.replace(topic, data);
        }
        else {
            currentWeatherState.put(topic, data);
        }
    }

    public float getWeatherState(String topic) {
        if (!currentWeatherState.containsKey(topic)) {
            throw new IllegalArgumentException("no data in given topic");
        }
        else {
            return currentWeatherState.get(topic);
        }
    }
}
