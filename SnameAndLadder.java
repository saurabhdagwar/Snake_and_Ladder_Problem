import java.util.*;
class SnakeAndLadder
{
//UC1 Initializing Starting position of game
        static final int  STARTING_POSITION = 0;
        static final int        ENDING_POSITION = 100;

        public void Rolling_Dice()
        {
                Random random = new Random();
                int DICE = (random.nextInt(6)+1);
                System.out.println("Rolling Dice :"+DICE);
        }

        public static void main(String args[])
        {
                SnakeAndLadder Game1 = new SnakeAndLadder();
                Game1.Rolling_Dice();
        }
}

