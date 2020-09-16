import java.util.*;
class SnakeAndLadder {
//UC1 Initializing Starting position of game
	static final int STARTINGPOSITION = 0;
	static final int ENDINGPOSITION = 100;
	static Random RANDOM = new Random();
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static String TASK ;
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;
	public int GamePlayed(int currentPosition, int DiceCount)
	{
//UC2 Initializing Rolling Dice
		if( currentPosition < ENDINGPOSITION )
		{
			int DICE = (RANDOM.nextInt(6)+1);
		//	total_dice_count++;
//UC3 defining Snake, Ladder or no play
			int action = RANDOM.nextInt(3);
			switch(action)
			{
				case LADDER:
				if(currentPosition + DICE <= ENDINGPOSITION)
				{
					currentPosition = currentPosition + DICE;
					TASK = "Ladder";
				}
				break;
				case SNAKE:
				if(currentPosition - DICE >= STARTINGPOSITION)
				{
					currentPosition = currentPosition - DICE;
					TASK = "Snake";
				}
				break;
				case NOPLAY:
				currentPosition = currentPosition;
				TASK = "noPlay";
				break;
			}
			System.out.println(" | Dice: "+DICE+" for "+TASK+" and Current Position : "+currentPosition+"| ");
		}
		if(TASK == "Ladder" && currentPosition != ENDINGPOSITION)
		{
			DiceCount = dice_Player(DiceCount);
			GamePlayed(currentPosition,DiceCount);
		}
		return currentPosition;
	}
// Dice count increment after every rolling dice
	public int dice_Player(int diceCount)
	{
		diceCount++;
		return diceCount;
	}
// Game played by two players
	public void TwoPlayers()
	{
		int Player1position = STARTINGPOSITION ;
		int Player2position = STARTINGPOSITION ;
		int dice_count = STARTINGPOSITION ;
		System.out.println("Game Started by two player");
		while( Player1position < ENDINGPOSITION && Player2position < ENDINGPOSITION )
		{
			System.out.println("Player 1 :-  ");
			Player1position = GamePlayed(Player1position,dice_count);
			dice_count = dice_Player(dice_count);
			System.out.println("-------------------------------------------------------------------------------------------------- ");
			if(Player1position == ENDINGPOSITION)
			{
				break;
			}
			System.out.println("Player 2 :-  ");
			Player2position = GamePlayed(Player2position,dice_count);
			dice_count = dice_Player(dice_count);
			System.out.println("---------------------------------------------------------------------------------------------------");
		}
		if(Player1position == ENDINGPOSITION)
		{
			System.out.println();
			System.out.println("Player 1 Won The Match ");
		}
		else if(Player2position == ENDINGPOSITION)
		{
			System.out.println();
			System.out.println("Player 2 Won The Match ");
		}
		System.out.println("Total Dice Count of both Players "+dice_count);
	}
	public static void main(String args[])
	{
		SnakeAndLadder	Player = new SnakeAndLadder();
		Player.TwoPlayers();
	}
}
