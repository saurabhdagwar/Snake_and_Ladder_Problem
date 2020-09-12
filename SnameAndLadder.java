import java.util.*;
class SnakeAndLadder {
//UC1 Initializing Starting position of game
	static final int STARTING_POSITION = 0;
	static final int ENDING_POSITION = 100;
	static Random RANDOM = new Random();
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static String TASK ;
	static final int PLAYER1 = 1;
	static final int PLAYER2 = 2;

	public int GamePlayed(int current_position, int DiceCount)
	{
//UC2 Initializing Rolling Dice
		if( current_position < ENDING_POSITION )
		{
			int DICE = (RANDOM.nextInt(6)+1);
		//	total_dice_count++;
//UC3 defining Snake, Ladder or no play
			int action = RANDOM.nextInt(3);
			switch(action)
			{
				case LADDER:
				if(current_position + DICE <= ENDING_POSITION)
				{
					current_position = current_position + DICE;
					TASK = "Ladder";

				}
				break;
				case SNAKE:
				if(current_position - DICE >= STARTING_POSITION)
				{
					current_position = current_position - DICE;
					TASK = "Snake";
				}
				break;
				case NOPLAY:
				TASK = "noPlay";
				break;
			}
			System.out.println(" | Dice: "+DICE+" for "+TASK+" and Current Position : "+current_position+"| ");
		}

		if(TASK == "Ladder" && current_position != ENDING_POSITION)
		{
			DiceCount = dice_Player(DiceCount);
			GamePlayed(current_position,DiceCount);
		}
		return current_position;
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
		int Player1_position = STARTING_POSITION ;
		int Player2_position = STARTING_POSITION ;
		int dice_count = STARTING_POSITION ;

		System.out.println("Game Played by the player");

		while( Player1_position < ENDING_POSITION && Player2_position < ENDING_POSITION )
		{
			System.out.println("Player 1 :-  ");
			Player1_position = GamePlayed(Player1_position,dice_count);
			System.out.println("Player 2 :-  ");
			Player2_position = GamePlayed(Player2_position,dice_count);
			dice_count = dice_Player(dice_count);
		}

		if(Player1_position == ENDING_POSITION)
		{
			System.out.println();
			System.out.println("Player 1 Won The Match ");
		}
		else if(Player2_position == ENDING_POSITION)
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
