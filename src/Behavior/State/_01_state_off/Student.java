package Behavior.State._01_state_off;

public class Student {
    private final int id;
    private final String name;
    private static int idCursor;

    public Student(String name) {
        this.name = name;
        this.id = idCursor++;
    }

    public int getId() {
        return id;
    }
}
