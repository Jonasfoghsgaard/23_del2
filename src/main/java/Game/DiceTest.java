package Game;

import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    Dice test = new Dice();
    Player test2 = new Player();

    @Test
    public void roll() {
        // Tester at terningen ikke slå mindre, eller mere end de givne grænseværdier.
        int i = 0;
        while (i < 10000) {
            int slag = Dice.roll();
            Assert.assertTrue(0 < slag);
            Assert.assertTrue(7 > slag);
            i++;
        }
    }


    @Test
    public void fordelling() {
        // Tester lige fordeling af terninger
        int[] array = new int[6];
        for (int u = 0; u < 10000000; u++) {
            int spredningAfSlag = Dice.roll();
            array[spredningAfSlag - 1]++;
        }
        System.out.println("et: " + array[0]);
        System.out.println("to: " + array[1]);
        System.out.println("tre: " + array[2]);
        System.out.println("fire: " + array[3]);
        System.out.println("fem: " + array[4]);
        System.out.println("seks: " + array[5]);
        System.out.println("I alt: " + (array[0] + array[1] + array[2] + array[3] + array[4] + array[5]));
    }


    @Test
    public void checkScore() {
        // Tester checkScore
        for (int j = 3; j > -2; j--) {
            System.out.print("Score: " + j + " ");
            System.out.println(Player.checkScore(j));
        }
    }


}