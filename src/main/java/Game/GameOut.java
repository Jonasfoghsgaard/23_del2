package Game;

import java.util.Scanner;

public class GameOut {

    static Player player = new Player();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {

            int sumEt = 1000; // Konto start
            int sumTo = 1000;
            int kastEt = 0; // Startsetup af terning
            int kastTo = 0;
            int sumAfKast = Dice.getSum(kastEt, kastTo);
            int runde = 1;


            Strings.Welcome(); // Velkomst besked
            Strings.SpillerNavn(1);
            String SpillerEt = Player.getName();
            Strings.SpillerNavn(2);
            String SpillerTo = Player.getName();

            while (sumEt < player.winningCondition && sumTo < player.winningCondition) {


                Strings.runde(runde);
                runde++;


                // Spiller nr. 1 tur start
                kastEt = Dice.kastEt();
                kastTo = Dice.kastTo();
                sumAfKast = Dice.getSum(kastEt, kastTo);
                Strings.indtastTegn(SpillerEt);
                Strings.slåMedTerning(Player.input());
                Strings.terninger(1, kastEt, 2, kastTo, sumAfKast);
                Strings.text(sumAfKast);
                sumEt = sumEt + PointTable.PointTable(sumAfKast);
                if (Player.checkScore(sumEt) == true) {
                    sumEt = 1000;
                }

                Strings.konto(SpillerEt, sumEt);
                Strings.line();
                sumEt = toEnsTier(sumEt, sumAfKast, SpillerEt);

                // Spiller nr. 1 tur slut


                if (sumEt >= player.winningCondition) {
                    Strings.win(SpillerEt);
                }

                if (sumEt <= player.winningCondition) {
                    // Spiller nr. 2 tur start
                    kastEt = Dice.kastEt(); // Skaffer ny terning værdi
                    kastTo = Dice.kastTo(); // Skaffer ny terning værdi
                    sumAfKast = Dice.getSum(kastEt, kastTo); // Finder sum af terningeværdi

                    Strings.indtastTegn(SpillerTo); // Tryk for at slå
                    Strings.slåMedTerning(Player.input()); // Fortæller at man slår med terninger
                    Strings.terninger(1, kastEt, 2, kastTo, sumAfKast); // Visning af terninger og terningsummen
                    Strings.text(sumAfKast);    // Udskrivning af text
                    sumTo = sumTo + PointTable.PointTable(sumAfKast); // Sammensætning af ny kontoværdi
                    if (Player.checkScore(sumTo) == true) {
                        sumTo = 1000;
                    }

                    Strings.konto(SpillerTo, sumTo); // Visning af konto
                    Strings.line();     //Skille linje

                    sumTo = toEnsTier(sumTo, sumAfKast, SpillerTo); // Slå 10

                    // Spiller nr. 2 tur slut

                    if (sumTo >= player.winningCondition) {
                        Strings.win(SpillerTo);

                    }
                }
            }

            System.out.println("Hvis du vil spille igen tast 'ja' ");
            String spilIgen = input.next();



            if (spilIgen.equalsIgnoreCase("Ja")) {
                playAgain = true;
            } else playAgain = false;
        }
     }

    public static int toEnsTier(int point, int sumAfKast, String spiller) {
        int kastEt;
        int kastTo;
        while (sumAfKast == 10) {

            kastEt = Dice.kastEt();
            kastTo = Dice.kastTo();
            sumAfKast = Dice.getSum(kastEt, kastTo);
            Strings.slåIgen(spiller);
            Strings.terninger(1, kastEt, 2, kastTo, sumAfKast);
            Strings.text(sumAfKast);
            point = point + PointTable.PointTable(sumAfKast);
            if (Player.checkScore(point) == true) {
                point = 1000;
            }
                Strings.konto(spiller, point);
                Strings.line();
        }
            return point;

    }
}







