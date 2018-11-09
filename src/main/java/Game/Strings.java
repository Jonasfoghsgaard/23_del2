package Game;

public class Strings {

    public static void SpillerNavn(int i){
        System.out.println("Indtast navn på spiller " + i +":");

    }

    public static void Welcome(){
        System.out.println("Velkommen til terninger og felter!");
    }

    public static void indtastTegn(String i){
        System.out.println( i + " skal indtaste et tegn, for at slå med terningerne");
    }

    public static void slåMedTerning(String i){
        System.out.println("Du tastede " +i+ " så slår vi med terningerne");
    }

    public static void terninger(int t1 , int s1 , int t2, int s2, int sum){
        System.out.println("Terning "+ t1 +": " + s1);
        System.out.println("Terning "+ t2 +": " + s2);
        System.out.println();
        System.out.println("Summen af terningerne er: " + sum );
    }

    public static void text (int i){
        System.out.println(TextTable.Text(i));
    }

    public static void konto (String spiller, int sumEt){
        System.out.println(spiller + " har nu " + sumEt);
    }

    public static void slåIgen (String spiller){
        System.out.println(spiller + " slår igen:");
    }

    public static void win (String spiller){
        System.out.println(spiller+ " Vandt!");
        line();
        }

    public static void line (){
        System.out.println("----------------------------------------------------------------");
    }

    public static void runde (int runde){
        System.out.println("Runde: " + runde);
        line();
    }

}






