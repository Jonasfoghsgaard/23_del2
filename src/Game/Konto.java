package Game;

public class Konto {

    //Opretter en balance variabel, da det skal bruges til spillernes pengebeholdning. Jeg kalder variablen "pengeBeholdning".
    private int pengeBeholdning;


    // Jeg opretter en konstruktør.
    public Konto(){

        pengeBeholdning = 1000;

    }

    //Her opretter jeg en metode getPengeBeholdning, så hver gang jeg kalder denne metode, vil den returnere spillerens beholdning.
    public int getPengeBeholdning(){

        return pengeBeholdning;

    }

    //Her opretter jeg en metode, hævePengeFraBeholdning, hvor der kan hæves, hvis der er penge på kontoen, derfor er denne metode en boolean.
    public boolean hævePengeFraBeholdning(int penge){

        if (pengeBeholdning - penge >= 0){

            pengeBeholdning -= penge;
            return true;

        }

        return false;

    }

    //Her opretter jeg en lignende metode som hævePengeFraBeholdning, hvor jeg tværtimod kalder denne for indskydPengeTilBeholdning.
    public boolean indskydPengeTilBeholdning(int penge){

        pengeBeholdning += penge;
        return true;

    }
}


