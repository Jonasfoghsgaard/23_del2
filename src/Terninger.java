import java.util.concurrent.ThreadLocalRandom;

public class Terninger {
    public static int getSum(int n1, int n2){ // metoden til at få summen af terningerne.
        int sum = n1+n2;
        return sum;
    }
    public static int roll() {
        int T2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);  // genererer et tilfældigt tal mellem 1 og 6
        return T2;
    }
}
