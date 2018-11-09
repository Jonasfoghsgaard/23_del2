package Game;

import java.util.concurrent.ThreadLocalRandom;
    public class Dice {

        static Player player = new Player();

   static int diceSum;
   static int dice1;
   static int dice2;

   public static int roll() {
        return ThreadLocalRandom.current().nextInt(player.diceMin, player.diceMax + 1);
    }


        public static int getSum(int n1, int n2){
            return n1+n2;
        }
        public static int kastEt(){
            dice1 = roll();

            return (dice1);
        }
        public static int kastTo(){

            dice2 = roll();
            return (dice2);
        }












}
