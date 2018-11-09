package Game;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTableTest {
    PointTable test = new PointTable();
    TextTable test2 = new TextTable();
    GameOut test3 = new GameOut();

    @Test
    public void pointTable() {


        for (int i = 2; i < 13; i++) {

            System.out.println("------------------------------------------------------------------");
            System.out.println("Terning: " + i);
            System.out.println(TextTable.Text(i));
            System.out.println(PointTable.PointTable(i));
        }
    }





}




















