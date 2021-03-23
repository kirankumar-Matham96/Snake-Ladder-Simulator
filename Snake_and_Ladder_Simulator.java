public class Snake_and_Ladder_Simulator
{
	public static void main(String[] args)
	{
		//Constants
		final int START_POSITION = 0;
		final int WINNING_POSITION = 100;
		final int LADDER = 1;
		final int SNAKE = 2;

		//Variables
		int position = 0; //Player position
		int noOfDieRolls = 0;


		//Start the game
		while(position != WINNING_POSITION)
		{
			noOfDieRolls++; //To count no. of die rolled/played
			//Generating options for game
			int option = (int) (Math.random()*10%3);
			//Rolling a Die
			int dieRoll = (int) (1+Math.random()*10%6);
			//Checking Ladder or Snake
			switch(option)
			{
				case LADDER:
					if((position+dieRoll) <= WINNING_POSITION)
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
			System.out.println("Player position: "+position);
		}
		System.out.println("Number of times die rolled: "+noOfDieRolls);
	}
}
