package hexlet.code.games;

import hexlet.code.Util;
import java.util.Scanner;

public class Even {

    public static void question() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static boolean play() {
        Scanner scanner = new Scanner(System.in);
        String even = "";
        String answer = "";
        int number = Util.random();

        if (number % 2 == 0) {
            even = "yes";
        } else {
            even = "no";
        }
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        answer = scanner.next();
        if (answer.equals(even)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + even + ".");
            return false;
        }
        return answer.equals(even);
    }
}
