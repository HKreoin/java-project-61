package hexlet.code;

import java.util.Scanner;

public class Logic {

    public static String great() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void even() {
        String name = great();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        String even = "";
        String answer = " ";

        for (int i = 0; i < 3; i++) {
            int number = random();
            if (number % 2 == 0) {
                even = "yes";
            } else {
                even = "no";
            }
            System.out.println("Question: " + number);
            answer = scanner.next();
            if (answer.equals(even)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + even + ".");
                System.out.println("Let's try again, " +  name + "!");
                break;
            }
        }
        if (answer.equals(even)) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int random() {
        int min = 1;
        int max = 100;
        int randomNumber = (int) (min + Math.random() * (max - min + 1));
        return randomNumber;
    }
}
