package Game;

import java.util.concurrent.ThreadLocalRandom;


public class Terninger {
    int antaløjne;
    int Terning1;
    int Terning2;

    Terninger (){
        Terning1 = roll();
        Terning2 = roll();
        antaløjne =Terninger.getSum(Terning1  ,Terning2);

    }


    public static int getSum(int n1, int n2){ // metoden til at få summen af terningerne.
        int sum = n1+n2;
        return sum;
    }
    public static int roll() {
        int T2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);  // genererer et tilfældigt tal mellem 1 og 6
        return T2;
    }
}
