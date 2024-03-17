package hexlet.code.games;

import hexlet.code.Util;

public class Even {

    public static void question() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static boolean play() {
        String even = "";
        int number = Util.random();

        if (number % 2 == 0) {
            even = "yes";
        } else {
            even = "no";
        }
        System.out.println("Question: " + number);
        String answer = Util.answer();
        return Util.check(answer, even);
    }
}
