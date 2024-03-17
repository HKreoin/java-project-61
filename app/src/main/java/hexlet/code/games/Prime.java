package hexlet.code.games;

import hexlet.code.Util;

public class Prime {

    public static void question() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static boolean play() {
        String prime = "";
        int number = Util.random();
        if (Util.prime(number)) {
            prime = "yes";
        } else {
            prime = "no";
        }
        System.out.println("Question: " + number);
        String answer = Util.answer();
        if (answer.equals(prime)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + prime + ".");
            return false;
        }
        return answer.equals(prime);
    }
}
