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
            System.out.println("Your answer: " + answer);
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

    public static void calc() {
        String name = great();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        String calc = "";
        String answer = "";

        for (int i = 0; i < 3; i++) {
            int number1 = random();
            int number2 = random();
            String operand = operand();

            System.out.println("Question: " + number1 + " " + operand + " " + number2);
            answer = scanner.next();
            System.out.println("Your answer: " + answer);
            switch (operand) {
                case "+" -> calc = String.valueOf(number1 + number2);
                case "-" -> calc = String.valueOf(number1 - number2);
                case "*" -> calc = String.valueOf(number1 * number2);
                default -> System.out.println("Incorrect operand");
            }
            if (answer.equals(calc)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + calc + ".");
                System.out.println("Let's try again, " +  name + "!");
                break;
            }
        }
        if (answer.equals(calc)) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int random() {
        int min = 1;
        int max = 100;
        int randomNumber = (int) (min + Math.random() * (max - min + 1));
        return randomNumber;
    }

    public static int random(int min, int max) {
        int randomNumber = (int) (min + Math.random() * (max - min + 1));
        return randomNumber;
    }

    public static String operand() {
        int random = random(0, 2);
        String[] operands = {"+", "-", "*"};
        return operands[random];
    }
}
