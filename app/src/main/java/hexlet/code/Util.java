package hexlet.code;

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
}
