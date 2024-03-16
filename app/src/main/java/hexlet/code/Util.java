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
}
