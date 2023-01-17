package Behavior.Interpreter._01_after;

import java.util.Map;

public class PlusExpression implements Expression {

    private final Expression left, right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
