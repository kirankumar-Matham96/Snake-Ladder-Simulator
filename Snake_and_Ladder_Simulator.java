public class Snake_and_Ladder_Simulator
{
	public static void main(String[] args)
	{
		//Constants
		final int START_POSITION = 0;
		final int WINNING_POSITION = 100;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;

		//Variables
		int position = 0; //Player position


		//Start the game
		//->Rolling a Die
		int dieRoll = (int) (1+Math.random()*10%6);

		//->Generating options for game
		int option = (int) (Math.random()*10%3);

	}
}
