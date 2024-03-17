package hexlet.code.games;

import hexlet.code.Util;

public class GSD {

    public static void question() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static boolean play() {
        int number1 = Util.random();
        int number2 = Util.random();

        System.out.println("Question: " + number1 + " " + number2);
        String answer = Util.answer();
        String gsd = String.valueOf(Util.gsd(number1, number2));
        return Util.check(answer, gsd);
    }
}
