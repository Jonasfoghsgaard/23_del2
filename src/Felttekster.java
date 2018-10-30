public class Felttekster {
    public static String Tekster (int n1){
        String tekst = null;
        switch (n1){
            case 2: tekst = "Du er landet på feltet Tower du får 250 penge.";
                break;
            case 3: tekst = "Du er landet på feltet crater, du mister 100 penge";
                break;
            case 4: tekst ="Du er landet på feltet Palace gates, du får 100 penge";
                break;
            case 5: tekst = "Du er landet på feltet Cold Desert, du mister 20 penge";
                break;
            case 6: tekst = "Du er landet på feltet Walled City, du får 180 penge";
                break;
            case 7: tekst = "Du er landet på feltet Monastery, du får 0 penge";
                break;
            case 8: tekst = "Du er landet på Black cave, du mister 70 penge";
                break;
            case 9: tekst = "Du er landet på Huts in the mountain, du får 60 penge";
                break;
            case 10: tekst = "Du er landet på feltet Werewall, du mister 80 penge, men må slå igen";
                break;
            case 11: tekst = "Du er landet på feltet The pit, du mister 50 penge";
                break;
            case 12: tekst = "Du har fundet guld i bjergene og sælger det for 650, du er rig!”";
                break;
        }
        return tekst;

    }
}
