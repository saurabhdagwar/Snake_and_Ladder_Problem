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

	public int GamePlayed(int current_position, int player, int DiceCount)
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
			if(player == 1)
			{
				dice_Player1(DiceCount);
				GamePlayed(current_position,player,DiceCount);
			}
			else if(player == 2)
			{
				dice_Player2(DiceCount);
				 GamePlayed(current_position,player,DiceCount);

			}

		
				}
	return current_position;
	}


	public int dice_Player2(int diceCount)
	{
		diceCount++;
		return diceCount;
	}

	public int dice_Player1(int diceCount)
	{
		diceCount++;
		return diceCount;
	}

	public void TwoPlayers()
	{
		int Player1_position = STARTING_POSITION ;
		int Player2_position = STARTING_POSITION ;
		int dice_count_Player1 = STARTING_POSITION ;
		int dice_count_Player2 = STARTING_POSITION ;
		System.out.println("Game Played by the player");
		while( Player1_position < ENDING_POSITION && Player2_position < ENDING_POSITION )
		{

			System.out.println("Player 1 :-  ");
			Player1_position = GamePlayed(Player1_position,1,dice_count_Player1);
			dice_count_Player1 = dice_Player1(dice_count_Player1);
			System.out.println("Player 2 :-  ");
			Player2_position = GamePlayed(Player2_position,2,dice_count_Player2);
			dice_count_Player2 = dice_Player2(dice_count_Player2);
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
//		System.out.println("Dice Count Player 1 : "+dice_count_Player1+" Dice Count Player 2 : "+dice_count_Player2);
	} 

	public static void main(String args[])
	{
	SnakeAndLadder	Player = new SnakeAndLadder();	
		Player.TwoPlayers();
	}
}
