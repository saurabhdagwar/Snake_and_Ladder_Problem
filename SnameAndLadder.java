import java.util.*;
class SnakeAndLadder
{
//UC1 Initializing Starting position of game
	static final int STARTINGPOSITION = 0;
	static final int ENDINGPOSITION = 100;

	public void RollingDice()
	{
		Random random = new Random();
		int DICE = (random.nextInt(6)+1);
		System.out.println("Rolling Dice :"+DICE);
	}

	public static void main(String args[])
	{
		SnakeAndLadder Game1 = new SnakeAndLadder();
		Game1.RollingDice();
	}
}
