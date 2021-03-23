public class Snake_and_Ladder_Simulator
{
	//Constants
	static final int START_POSITION = 0;
	static final int WINNING_POSITION = 100;
	static final int LADDER = 1;
	static final int SNAKE = 2;
        static int player_1_position = START_POSITION;
	static int player_2_position = START_POSITION;

	public static int[] play(int position) //returns integer type array
	{
		//Generating options for game
		int option = (int) (Math.random()*10%3);
		//Rolling a Die
		int dieRoll = (int) (1+Math.random()*10%6);
		int[] array = new int[2]; //Array to store details and return to main method
		//Checking Ladder or Snake
		switch(option)
		{
			case LADDER:
				if((position+dieRoll) <= WINNING_POSITION)//<<---------------------
				{
					position += dieRoll;
				}
				break;
			case SNAKE:
				if((position-dieRoll) >= 0)
				{
					position -= dieRoll;
				}
				else
				{
					position = 0;
				}
				break;
			default: //NoPlay option
				position += 0;
		}
		array[0] = option;
		array[1] = position;
		return array;
	}

	public static void main(String[] args)
	{
		//variables
		int noOfDieRolls_1 = 0;
		int noOfDieRolls_2 = 0;
		int player_1_option = LADDER; //To play initially
		int player_2_option = LADDER;
		int[] player_1 = new int[2]; //Array to get player_1 details from 'play' method
		int[] player_2 = new int[2]; //Array to get player_2 details from 'play' method

		//Start the game
		while((player_1_position != WINNING_POSITION) && (player_2_position != WINNING_POSITION))
		{
			while(player_1_option == LADDER)
			{
				player_1 = play(player_1_position);//player1
				player_1_option = player_1[0]; //option from play method
				player_1_position = player_1[1]; //position from play method
				noOfDieRolls_1++;
			}
			while(player_2_option == LADDER)
			{
				player_2 = play(player_2_position);//player2
				player_2_option = player_2[0]; //option from play method
				player_2_position = player_2[1]; //position from play method
				noOfDieRolls_2++;
			}
			player_1_option = LADDER;
                        player_2_option = LADDER;
		}

		//Checking the winner
		if(player_1_position == WINNING_POSITION)
		{
			System.out.println("The winner is: Player_1 with position: "+player_1_position);
		}
		else
		{
			System.out.println("The winner is: Player_2 with position: "+player_2_position);
		}
		System.out.println("Number of times die rolled: "+"\n"+"Player_1: "+noOfDieRolls_1+"\n"+"Player_2: "+noOfDieRolls_2);
	}

}
