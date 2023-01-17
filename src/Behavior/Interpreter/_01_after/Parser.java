package Behavior.Interpreter._01_after;

import java.util.Stack;

public class Parser {
    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static Expression getExpression(char c, Stack<Expression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                Expression left =stack.pop();
                Expression right = stack.pop();
                return new MinusExpression(left, right);
            default:
                return new VariableExpression(c);
        }
    }
}
