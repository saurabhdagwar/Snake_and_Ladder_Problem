import java.util.*;
class SnakeAndLadder
{
//UC1 Initializing Starting position of game
	static final int  STARTING_POSITION = 0;
	static final int	ENDING_POSITION = 100;

	public static void GamePlayed()
	{
//UC2 Initializing Rolling Dice
		Random random = new Random();
		int current_position;
		int DICE = (random.nextInt(6)+1);
//UC3 defining Snake, Ladder or no play
		int action = random.nextInt(3);
		current_position = STARTING_POSITION;
		System.out.println("Rolling Dice : "+DICE);
		System.out.println("Action perform :"+action);
		if(action == 1 && (current_position + DICE != ENDING_POSITION))
		{

				current_position = current_position + DICE;
				System.out.println("Player moves for Ladder");
		}
		else if(action == 2 && (current_position - DICE != STARTING_POSITION))
		{

				current_position = current_position - DICE;
				System.out.println("Player moves for Snake");
		}
		else
		{
				 System.out.println("No Play");
		}

	}

	public static void main(String args[])
	{
	SnakeAndLadder	Player = new SnakeAndLadder();	
		Player.GamePlayed();
	}
}

