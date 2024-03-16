package hexlet.code.games;

import hexlet.code.Util;
import java.util.Scanner;

public final class Calc {
    public static boolean play() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        String calc = "";
        String answer = "";

        int number1 = Util.random();
        int number2 = Util.random();
        String operand = Util.operand();

        System.out.println("Question: " + number1 + " " + operand + " " + number2);
        System.out.print("Your answer: ");
        answer = scanner.next();
        calc = switch (operand) {
            case "+" -> String.valueOf(number1 + number2);
            case "-" -> String.valueOf(number1 - number2);
            case "*" -> String.valueOf(number1 * number2);
            default -> throw new UnsupportedOperationException("Incorrect operand");
        };
        if (answer.equals(calc)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + calc + ".");
            return false;
        }
        return answer.equals(calc);
    }
}