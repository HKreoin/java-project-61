package hexlet.code.games;

import hexlet.code.Util;
import java.util.Scanner;

public class GSD {
    public static boolean play() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);

        int number1 = Util.random();
        int number2 = Util.random();
        System.out.println("Question: " + number1 + " " + number2);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        String gsd = String.valueOf(Util.gsd(number1, number2));
        if (answer.equals(gsd)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + gsd + ".");
            return false;
        }
        return answer.equals(gsd);
    }
}
