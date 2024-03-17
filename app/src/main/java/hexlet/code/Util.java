package hexlet.code;

import java.util.Scanner;

public class Util {
    public static int random() {
        return random(1, 100);
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
        int[] numbers = new int[random(5, 10)];
        int append = random(1, 10);
        numbers[0] = random(0, 100);
        int length = numbers.length;

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
        if (num > 1) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
