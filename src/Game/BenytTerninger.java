package Game;

public class BenytTerninger {

    //Her oprettes der array, der der skal være to terninger.
    private Terning[] terninger;

    //Her benytter vi to terninger, da vi lige har oprettet vores array objekt, men her tildeler vi siderne.
    public BenytTerninger(){

        terninger = new Terning[]{new Terning(6), new Terning(6)};

    }

    //Denne metode finder summen ud fra terning1 og terning2, som vi lige havde oprettet.
    public int getTerningSum(){

        int resultat = 0;
        for (Terning terning : terninger) {

            resultat += terning.getØjne();

        }

        return resultat;

    }

    //Denne metode benytter disse ny oprettede terninger til at rulle, da vi i klassen rul havde lavet en metode til at rulle.
    //Derfor tildeler vi metoden til begge terninger. Den vil ikke returnere noget, da vi allerede havde defineret metoden.
    public void rul(){

        for(Terning terning : terninger){

            terning.rul();

        }
    }

    //Her opretter jeg metode der gør at for hver terning, vil den tilføje værdien til et array.
    public int[] getTerningensØjne(){

        int [] resultat = new int[terninger.length];
        for (int i = 0; i < terninger.length; i++) {

            resultat[i] = terninger[i].getØjne();

        }

        return resultat;

    }
}