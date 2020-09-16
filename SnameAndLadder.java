import java.util.*;
class SnakeAndLadder
{
//UC1 Initializing Starting position of game
	static final int STARTINGPOSITION = 0;
	static final int ENDINGPOSITION = 100;
	public void GamePlayed()
	{
//UC2 Initializing Rolling Dice
		Random random = new Random();
		int currentposition = STARTINGPOSITION ;
		String task ;
		int total_dice_count = 0;
// UC4 while loop for repet till player won
		System.out.println("Game Played by the player");
		System.out.println(" ");
		while( currentposition < ENDINGPOSITION )
		{
			int DICE = (random.nextInt(6)+1);
			total_dice_count++;
//UC3 defining Snake, Ladder or no play
			int action = random.nextInt(3);
			if(action == 1 && (currentposition + DICE <= ENDINGPOSITION))
			{
				currentposition = currentposition + DICE;
				task = "Ladder";
			//	System.out.println("Player moves for Ladder");
			}
			else if(action == 2 && (currentposition - DICE >= STARTINGPOSITION))
			{

				currentposition = currentposition - DICE;
				task = "Snake";
			//	System.out.println("Player moves for Snake");
			}
			else
			{
				task = "noPlay";
			//	 System.out.println("No Play");
			}
			System.out.println(" | Dice: "+DICE+" for "+task+" and Current Position : "+currentposition+"| ");
		}
		System.out.println(" ");
//UC6 total times dice throws
		System.out.println("Total Count of Dice Throws : "+total_dice_count);
	}
	public static void main(String args[])
	{
		SnakeAndLadder	Player = new SnakeAndLadder();	
		Player.GamePlayed();
	}
}
