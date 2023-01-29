package Behavior.Observer._01_advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherData {
    private final Map<String, Float> currentWeatherState;
    private final Map<String, List<Display>> displays;

    public WeatherData() {
        this.currentWeatherState = new HashMap<>();
        this.displays = new HashMap<>();
    }

    public void addDisplay(String topic, Display display) {
        if(displays.containsKey(topic)) {
            displays.get(topic).add(display);
        }
        else {
            List<Display> list = new ArrayList<>();
            list.add(display);
            displays.put(topic, list);
        }
    }

    public void removeDisplay(Display display) {
        for(Map.Entry<String, List<Display>> displays : displays.entrySet()) {
            List<Display> list = displays.getValue();
            list.removeIf(d -> d.hashCode() == display.hashCode());

            if(displays.getValue().size() == 0) {
                this.displays.remove(displays.getKey());
            }
        }
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

    public void topicDataChanged(String topic) {
        if(displays.containsKey(topic)) {
            float data = currentWeatherState.get(topic);
            for (Display d : displays.get(topic)) {
                d.update(data);
            }
        }
        else {
            System.out.println("there is no display to " + topic);
        }
    }
}
