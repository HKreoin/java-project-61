package hexlet.code;

import java.util.Scanner;

public class Util {
    public static int random() {

        int min = 1;
        int max = 100;

        return random(min, max);
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

    public static int gsd(int num1, int num2) {

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        while (max % min != 0) {
            int buffer = min;
            min = max % min;
            max = buffer;
        }

        return min;
    }

    public static int[] progression() {
        int minLength = 5;
        int maxLength = 10;
        int[] numbers = new int[random(minLength, maxLength)];
        int minStep = 1;
        int maxStep = 10;
        int append = random(minStep, maxStep);
        int minNumber = 0;
        int maxNumber = 100;
        int length = numbers.length;

        numbers[0] = random(minNumber, maxNumber);

        for (int i = 1; i < length; i++) {
            numbers[i] = numbers[i - 1] + append;
        }

        return numbers;
    }

    public static String[] numsToStringArray(int[] numbers) {

        int length = numbers.length;
        String[] newArray = new String[length];

        for (int i = 0; i < length; i++) {
            newArray[i] = String.valueOf(numbers[i]);
        }

        return newArray;
    }

    public static void printArray(String[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static String answer() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String answer = scanner.next();

        return answer;
    }

    public static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean check(String value1, String value2) {

        if (value1.equals(value2)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(value1 + " is wrong answer ;(. Correct answer was " + value2 + ".");
            return false;
        }
    }
}
