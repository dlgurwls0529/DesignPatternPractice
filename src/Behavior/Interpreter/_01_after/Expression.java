package Behavior.Interpreter._01_after;

import java.util.Map;

public interface Expression {
    public int interpret(Map<Character, Integer> context);
}
