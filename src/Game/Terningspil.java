package Game;

// Det er her selve spillet vil køre. (Det er den her vi tester.)
public class Terningspil {

    // Da denne klasse skal indeholde de objekter fra de andre klasser, bliver vi nødt til at "kalde" på dem.
    private Felter[] felter;


    //Da vi ovenover oprettede et array der hedder felter, skal vi forneden hente de antal felter, det vi nu skal bruge,
    // og sætte de enkelte navne, belønninger, beskrivelse af feltet og om det er sandt/falsk om en ekstra tur.

    public Terningspil(){

        felter = new Felter[11];
        felter[0] = new Felter("Tower",250,"Velkommen til feltet Tower, her er vi gavmilde og søde så du får 250 penge.",false);
        felter[1] = new Felter("Crater",-100,"Du kører fuldstændig galt og lander i feltet Crater. du mister 100 penge",false);
        felter[2] = new Felter("Palace gates",100,"Velkommen til himlen, til paradis, til feltet Palace gates, du får 100 penge",false);
        felter[3] = new Felter("Cold desert",-20,"Vi håber virkelig du har pakket en vinterjakke, for du er landet på feltet Cold Desert, du mister 20 penge",false);
        felter[4] = new Felter("Walled city",180,"En væg, to vægge, tre vægge, ja du er landet på feltet Walled City, du får 180 penge",false);
        felter[5] = new Felter("Monastery",0,"Vi håber du har sagt dine bønner. Velkommen til Monastery, du får 0 penge",false);
        felter[6] = new Felter("Black cave",-70,"Det er sort, det er mørt, du er bange. Du er i Black cave, du mister 70 penge",false);
        felter[7] = new Felter("Huts int the mountain",60,"Her skal den gode udsigt nydes. Velkommen til Huts in the mountain, du får 60 penge",false);
        felter[8] = new Felter("The werewall",-80,"PAS PÅ! Fuldmånen er ude, du er landet på Werewall som stjæler 80 penge men du løber så hurtigt at du må slå igen.",true);
        felter[9] = new Felter("The pit",-50,"Din bil skal altså have skiftet dæk og det koster. Velkommen i The pit, du mister 50 penge",false);
        felter[10] = new Felter("Goldmine",650,"Du har fundet guld i bjergene og sælger det for 650, du er rig!",false);


        }
}
