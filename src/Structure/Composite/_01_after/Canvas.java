package Structure.Composite._01_after;

import java.util.ArrayList;
import java.util.List;

public class Canvas implements UI {

    private int x;
    private int y;

    private final List<UI> components = new ArrayList<UI>();

    public Canvas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addComponent(UI ui) {
        components.add(ui);
    }

    public void removeComponent(UI ui) {
        components.remove(ui);
    }

    @Override
    public void move(int offset_x, int offset_y) {
        this.x += offset_x; this.y += offset_y;

        for (UI component : components) {
            component.move(offset_x, offset_y);
        }
    }

    @Override
    public String getPositionInfo() {
        StringBuilder result;
        result = new StringBuilder(" Canvas : (" + this.x + ", " + this.y + ")");
        for(UI component : components) {
            result.append(component.getPositionInfo());
        }

        return result.toString();
    }
}
