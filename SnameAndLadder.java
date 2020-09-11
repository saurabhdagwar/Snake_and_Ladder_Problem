import java.util.*;
class SnakeAndLadder
{
//UC1 Initializing Starting position of game
	static final int  STARTING_POSITION = 0;
	static final int	ENDING_POSITION = 100;

	public void GamePlayed()
	{
//UC2 Initializing Rolling Dice
		Random random = new Random();
		int current_position = STARTING_POSITION ;
		String task ;
		int total_dice_count = 0;
// UC4 while loop for repet till player won
		System.out.println("Game Played by the player");
		System.out.println(" ");
		while( current_position < ENDING_POSITION )
		{
			int DICE = (random.nextInt(6)+1);
			total_dice_count++;
//UC3 defining Snake, Ladder or no play
			int action = random.nextInt(3);

			//System.out.println("Rolling Dice : "+DICE);
			//System.out.println("Action perform :"+action);
			if(action == 1 && (current_position + DICE <= ENDING_POSITION))
			{

					current_position = current_position + DICE;
					task = "Ladder";
			//		System.out.println("Player moves for Ladder");
			}
			else if(action == 2 && (current_position - DICE >= STARTING_POSITION))
			{

					current_position = current_position - DICE;
					task = "Snake";
			//		System.out.println("Player moves for Snake");
			}
			else
			{
					task = "noPlay";
			//		 System.out.println("No Play");
			}
			System.out.println(" | Dice: "+DICE+" for "+task+" and Current Position : "+current_position+"| ");
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

