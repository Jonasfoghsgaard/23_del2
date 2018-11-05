package Game;

public class Terning {

    // Opretter to variabler der skal bruges til denne klasse.
    private int sider;
    private int øjne;

    //Her har jeg en metode rul, der ruller med de antal øjne der nu er på terningen, i dettet tilfælde er det en tilfældig værdi mellem 1 og 6.
    public void rul(){

        øjne = (int)(sider * Math.random())+1;

    }

    //Her oprettes der et hvis-antal sider på en terning
    public Terning(int sider){

        this.sider = sider;
        rul();

    }

    //Denne metode returnerer "face value", altså værdien der er blevet slået.
    public int getØjne(){

        return øjne;

    }



}



