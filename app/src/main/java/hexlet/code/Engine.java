package hexlet.code;

import hexlet.code.games.Great;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GSD;

public class Engine {
    public static void start(int numOfGame) {
        String name = Great.play();
        if (numOfGame != 1) {
            boolean state = true;
            for (int i = 0; i < 3 && state; i++) {
                state = switch (numOfGame) {
                    case 2 -> Even.play();
                    case 3 -> Calc.play();
                    case 4 -> GSD.play();
                    default -> false;
                };
            }
            if (state) {
                System.out.println("Congratulations, " + name + "!");
            } else {
                System.out.println("Let's try again, " +  name + "!");
            }
        }
    }
}
