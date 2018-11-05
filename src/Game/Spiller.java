package Game;

public class Spiller {

    //Opretter to variabler der skal indgå i denne klasse og den ene variabel, har vi allerede fra konto klassen, derfor nævner jeg den også her.
    private String navn;
    private Konto konto;

    /*Denne metode skal vise om spilleren har vundet, hvis der er 3000 penge eller mere på beholdningen, derfor opretter man en boolean -
        da det skal være sandt, hvis man har 3000 eller mere, så man kan vinde. */
    public boolean spillerVinder(){

        return this.getKonto() >= 3000;

    }
    //Her opretter jeg en konstruktør, der netop gør, at én spiller har én konto og ét navn.
    public Spiller(String navn){

        this.navn = navn;
        konto = new Konto();

    }

    //Denne metode returnerer navnet
    public String getNavn(){

        return navn;

    }

    //Denne metode returnerer kontoen og dens beholdning. Det betyder, at spilleren starter med en beholdning på 1000 penge. Dette kan ses i konto klassen.
    public int getKonto(){

        return konto.getPengeBeholdning();

    }

    /*Her bliver vi nødt til at oprette en metode der kan ændre pengene på beholdningen ud frad et felt man lander på. Dette er pga. der er både en positiv -og
    negativeffekt på pengebeholdningen */
    public boolean ændringAfKonto(int penge){
        if(penge == 0) {

            return true;

        }

        else if (penge > 0) {

            return konto.indskydPengeTilBeholdning(penge);

        }

        else {

            return konto.hævePengeFraBeholdning(-penge);

        }
    }
}






