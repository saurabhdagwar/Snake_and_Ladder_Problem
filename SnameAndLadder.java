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

// UC4 while loop for repet till player won
		System.out.println("Game Played by the player");
		System.out.println(" ");
		while( current_position < ENDING_POSITION )
		{
			int DICE = (random.nextInt(6)+1);
//UC3 defining Snake, Ladder or no play
			int action = random.nextInt(3);

			//System.out.println("Rolling Dice : "+DICE);
			//System.out.println("Action perform :"+action);
			if(action == 1 && (current_position + DICE <= ENDING_POSITION))
			{

					current_position = current_position + DICE;
			//		System.out.println("Player moves for Ladder");
			}
			else if(action == 2 && (current_position - DICE >= STARTING_POSITION))
			{

					current_position = current_position - DICE;
			//		System.out.println("Player moves for Snake");
			}
			else
			{
			//		 System.out.println("No Play");
			}
//UC5 Player reaches at exact winning position 
			System.out.println("Dice : "+DICE+" | Current Position : "+current_position);

		}
		System.out.println(" ");

	}

	public static void main(String args[])
	{
	SnakeAndLadder	Player = new SnakeAndLadder();	
		Player.GamePlayed();
	}
}

