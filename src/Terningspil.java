public class Terningspil {
    public static void main(String[] args) {
        int a = Terninger.roll();
        int b = Terninger.roll();
        int c = Terninger.getSum(a,b);
        System.out.println(a + " " +b + " " + c);


    }
}

