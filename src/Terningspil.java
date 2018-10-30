import java.util.Scanner;

public class Terningspil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Terninger.roll();
        int b = Terninger.roll();
        int c = Terninger.getSum(a,b);
        System.out.println(a + " " +b + " " + c);
        String Spiller1 = scan.nextLine();
        String Spiller2 = scan.nextLine();
        System.out.println(Spiller1 + " " + Spiller2);
    }
}

