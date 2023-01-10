package Structure.FlyWeight._01_after;

import java.util.HashMap;

public class FontFactory {

    private final HashMap<String, Font> hashMap = new HashMap<>();

    public Font getFont(String fontInfo) {
        Font font;

        if(hashMap.containsKey(fontInfo)) {
            font = hashMap.get(fontInfo);
        }
        else {
            String[] strings = fontInfo.split(":");
            font = new Font(strings[0], Integer.parseInt(strings[1]));
            hashMap.put(fontInfo, font);
        }

        return font;
    }
}
