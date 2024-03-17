package hexlet.code.games;

import hexlet.code.Util;

public class Progression {

    public static void question() {
        System.out.println("What number is missing in the progression?");
    }

    public static boolean play() {
        int[] numbers = Util.progression();
        int position = Util.random(0, numbers.length - 1);
        String hiddenNum =  String.valueOf(numbers[position]);
        String[] hiddenProg = Util.numsToStringArray(numbers);

        hiddenProg[position] = "..";

        System.out.print("Question: ");
        Util.printArray(hiddenProg);
        String answer = Util.answer();
        if (answer.equals(hiddenNum)) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + hiddenNum + ".");
            return false;
        }
        return answer.equals(hiddenNum);
    }
}
