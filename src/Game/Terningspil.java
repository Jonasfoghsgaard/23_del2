package Game;
public class Terningspil {          // Det er her selve spillet vil køre. (Det er den her vi tester.)
    public static void main(String[] args) {

        Feltliste felt = new Feltliste();
        Terninger slag = new Terninger();
        System.out.println(slag.Terning1 + " "+slag.Terning2+" "+slag.antaløjne);



        //String Spiller1 = Spiller.getName();
        //String Spiller2 = Spiller.getName();
        //System.out.println(Spiller1 + " " + Spiller2);

        System.out.println(Feltliste.felter(slag.antaløjne) + " " +Felttekster.Tekster(slag.antaløjne));
        Konto t1 = new Konto();
        System.out.println(felt.penge);
        System.out.println(t1.startværdi+ " "+t1.felt +" " + t1.beholdning);







        }





    }
