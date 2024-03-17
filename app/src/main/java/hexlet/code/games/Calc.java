package hexlet.code.games;

import hexlet.code.Util;

public final class Calc {

    public static void question() {
        System.out.println("What is the result of the expression?");
    }

    public static boolean play() {

        int number1 = Util.random();
        int number2 = Util.random();
        String operand = Util.operand();

        System.out.println("Question: " + number1 + " " + operand + " " + number2);
        String answer = Util.answer();
        String calc = switch (operand) {
            case "+" -> String.valueOf(number1 + number2);
            case "-" -> String.valueOf(number1 - number2);
            case "*" -> String.valueOf(number1 * number2);
            default -> throw new UnsupportedOperationException("Incorrect operand");
        };
        return Util.check(answer, calc);
    }
}
