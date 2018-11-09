package Game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOutTest {

    GameOut test = new GameOut();

    @Test
    public void main() {
    }

    public void roll (){
        int slag = Dice.dice1;
        assertTrue((7 > slag) && (slag > 0));
    }
}