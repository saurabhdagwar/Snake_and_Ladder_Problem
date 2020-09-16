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
		int currentPosition = STARTINGPOSITION ;
// UC4 while loop for repet till player won
		System.out.println("Game Played by the player");
		System.out.println(" ");
		while( currentPosition < ENDINGPOSITION )
		{
			int DICE = (random.nextInt(6)+1);
//UC3 defining Snake, Ladder or no play
			int action = random.nextInt(3);

			//System.out.println("Rolling Dice : "+DICE);
			//System.out.println("Action perform :"+action);
			if(action == 1 && (currentPosition + DICE <= ENDINGPOSITION))
			{
					currentPosition = currentPosition + DICE;
			//		System.out.println("Player moves for Ladder");
			}
			else if(action == 2 && (currentPosition - DICE >= STARTINGPOSITION))
			{
					currentPosition = currentPosition - DICE;
			//		System.out.println("Player moves for Snake");
			}
			else
			{
			//		 System.out.println("No Play");
			}
//UC5 Player reaches at exact winning position 
			System.out.println("Dice : "+DICE+" | Current Position : "+currentPosition);

		}
		System.out.println(" ");

	}

	public static void main(String args[])
	{
		SnakeAndLadder	Player = new SnakeAndLadder();	
		Player.GamePlayed();
	}
}

