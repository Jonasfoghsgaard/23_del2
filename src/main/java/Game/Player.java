package Game;

import java.util.Scanner;

public class Player {
    int diceAmount;
    int winningCondition;
    int diceMin;
    int diceMax;

    Player() {
        diceAmount = 2;
        winningCondition = 3000;
        diceMin = 1;
        diceMax = 6;
    }


    public static String input() {
        Scanner scannerTo = new Scanner(System.in);
        String startKnap = scannerTo.next();
        return startKnap;
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);

        String spillerNavn = scanner.nextLine();
        return spillerNavn;

    }

    public static boolean checkScore(int i) {

        boolean check = false;
        if (i <= 0) {
            System.out.println("Fordi du ikke havde flere penge får du 1000 point.");
            check = true;
            System.out.println();
        }
        return check;
    }
}
