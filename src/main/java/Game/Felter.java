package Game;

public class Felter {

    //Jeg opretter de variabler der skal indgå pr. felt. det der indgår i et felt er:
    // 1. navnet på feltet, ellers ved man ikke hvad man lander på.
    // 2. hvad der sker når der landes på feltet.
    // 3. hvad får man når man lander på feltet.
    // 4. Og i opgave beskrivelsen står der, at et af felterne giver ekstratur.
    // 5. Mere er der ikke :-)

    private String navn;
    private int belønning;
    private String beskrivelse;
    private boolean ekstraTur;


    //Nu laver vi en konstruktør, ligesom de andre klasser, hvor vi definere disse variabler til og netop ét felt.
    public Felter(String navn, int belønning, String beskrivelse, boolean ekstraTur){

        this.navn = navn;
        this.belønning = belønning;
        this.beskrivelse = beskrivelse;
        this.ekstraTur = ekstraTur;

    }

    //Ligesom nævnt før, så har et eller flere felter flere forskellige beksrivelser,
    // derfor skal der oprettes en metode angående beskrivelsen af et felt.
    public String getBeskrivelse(){

        return beskrivelse;

    }

    //Som nævnt tidligere, skal der laves noget med en ekstraTur, derfor betyder det, at vi laver en boolean metode,
    // hvis man rammer det felt der giver en ekstraTur.
    public boolean enEkstraTur(){

        return ekstraTur;

    }

    //Den sidste fase er netop belønningen. Denne metode returnerer en boolean,
    // hvis spilleren lander på et lovligt felt. Det vil returnere falsk,
    // hvis spilleren ikke kan trække eller indskyde på det felt der stås på.
    public boolean belønningAfFelt(Spiller spiller){

        return spiller.ændringAfKonto(this.belønning);

    }
}

