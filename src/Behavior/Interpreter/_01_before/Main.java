package Behavior.Interpreter._01_before;

public class Main {
    public static void main(String[] args) {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }
}
