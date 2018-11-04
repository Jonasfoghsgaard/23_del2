package Game;

public class Feltliste {
    public static int felter (int n1) {         // Har en positiv eller negativ effekt på pengebeholdningen.
        int penge = 0;
        switch (n1){
            case 2: penge =penge + 250;
            break;
            case 3: penge =penge - 100;
            break;
            case 4: penge =penge + 100;
            break;
            case 5: penge =penge - 20;
            break;
            case 6: penge =penge + 180;
            break;
            case 7: penge = penge + 0;
            break;
            case 8: penge = penge -  70;
            break;
            case 9: penge = penge +60;
            break;
            case 10: penge = penge - 80;
            break;
            case 11: penge = penge -50;
            break;
            case 12: penge =penge + 650;
            break;
        }
        return penge;
    }

}
