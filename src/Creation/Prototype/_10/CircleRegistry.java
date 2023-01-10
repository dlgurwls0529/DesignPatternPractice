package Creation.Prototype._10;

import java.util.HashMap;
import java.util.Map;

public class CircleRegistry {

    private static Map<String, Circle> map = new HashMap<>();

    public static void addItem(String id, Circle circle) {
        map.put(id, circle);
    }

    public static Circle getById(String id) {
        return (Circle) map.get(id).clone();
    }
}
