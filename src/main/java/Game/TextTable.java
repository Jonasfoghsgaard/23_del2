package Game;

public class TextTable {

    public static String Text(int valueOfDice){      // Dette er metoden som udskriver feltteksterne.
        String text = null;
        switch (valueOfDice){

            case 2: text = "Velkommen til feltet Tower, her er vi gavmilde og søde så du får 250 penge.";
                break;
            case 3: text = "Du kører fuldstændig galt og lander i feltet Crater. du mister 100 penge";
                break;
            case 4: text ="Velkommen til himlen, til paradis, til feltet Palace gates, du får 100 penge";
                break;
            case 5: text = "Vi håber virkelig du har pakket en vinterjakke, for du er landet på feltet Cold Desert, du mister 20 penge";
                break;
            case 6: text = "En væg, to vægge, tre vægge, ja du er landet på feltet Walled City, du får 180 penge";
                break;
            case 7: text = "Vi håber du har sagt dine bønner. Velkommen til Monastery, du får 0 penge";
                break;
            case 8: text = "Det er sort, det er mørkt, du er bange. Du er i Black cave, du mister 70 penge";
                break;
            case 9: text = "Her skal den gode udsigt nydes. Velkommen til Huts in the mountain, du får 60 penge";
                break;
            case 10: text = "PAS PÅ! Fuldmånen er ude, du er landet på Werewall som stjæler 80 penge men du løber så hurtigt at du må slå igen.";
                break;
            case 11: text = "Din bil skal altså have skiftet dæk og det koster. Velkommen i The pit, du mister 50 penge";
                break;
            case 12: text = "Du har fundet guld i bjergene og sælger det for 650, du er rig!”";
                break;
        }
        return text;

    }
}
