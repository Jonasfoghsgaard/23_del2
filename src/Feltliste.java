public class Feltliste {
    public static int felter () {
        int x = Terninger.getSum(Terninger.roll(),Terninger.roll());
        int penge = 0;
        String Felttekst;
        switch (x){
            case 2: penge =penge + 250; Felttekst = "Du er landet på feltet Tower du får 250 penge.";
            break;
            case 3: penge =penge - 100; Felttekst = "Du er landet på feltet crater, du mister 100 penge";
            break;
            case 4: penge =penge + 100; Felttekst ="Du er landet på feltet Palace gates, du får 100 penge";
            break;
            case 5: penge =penge - 20; Felttekst = "Du er landet på feltet Cold Desert, du mister 20 penge";
            break;
            case 6: penge =penge + 180; Felttekst = "Du er landet på feltet Walled City, du får 180 penge";
            break;
            case 7: penge = penge + 0; Felttekst = "Du er landet på feltet Monastery, du får 0 penge";
            break;
            case 8: penge = penge -  70; Felttekst = "Du er landet på Black cave, du mister 70 penge";
            break;
            case 9: penge = penge +60; Felttekst = "Du er landet på Huts in the mountain, du får 60 penge";
            break;
            case 10: penge = penge - 80; Felttekst = "Du er landet på feltet Werewall, du mister 80 penge, men må slå igen";
            break;
            case 11: penge = penge -50; Felttekst = "Du er landet på feltet The pit, du mister 50 penge";
            break;
            case 12: penge =penge + 650; Felttekst = "Du har fundet guld i bjergene og sælger det for 650, du er rig!”";
            break;
        }
        return penge;
    }

}
