package hexlet.code;

import hexlet.code.games.Great;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GSD;
import hexlet.code.games.Progression;

public class Engine {
    public static void start(int numOfGame) {
        String name = Great.play();
        switch (numOfGame) {
            case 2 -> Even.question();
            case 3 -> Calc.question();
            case 4 -> GSD.question();
            case 5 -> Progression.question();
            default -> System.out.print("Error of game choose");
        }

        if (numOfGame != 1) {
            boolean state = true;
            for (int i = 0; i < 3 && state; i++) {
                state = switch (numOfGame) {
                    case 2 -> Even.play();
                    case 3 -> Calc.play();
                    case 4 -> GSD.play();
                    case 5 -> Progression.play();
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
