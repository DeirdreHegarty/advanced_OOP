import java.util.Scanner;
import java.util.Random;
/**
****Casino Craps Example Game***
*
*The following code attempts to simulate a Casino Craps game.
*
*Casino Craps (Basic Game) explanation:
*The game of "craps" is commonly played in Casino’s. 
*
*Generally, the game works as follows:
*A player rolls two dice (each with 6 possible values, 1 – 6). After rolling the two dice, 
*the sum of the scores are added. If the sum is 7 or 11 on the first throw, the player wins. 
*
*If the sum is 2, 3 or 12 on the first throw – it is called "craps" and the player loses. 
*
*If the sum is any of the remaining values (4, 5, 6, 8, 9 or 10) this is called the players 
*"point" (or "point-value"). 
*
*Rolling a point-value gives the player a chance to roll again. The player can win the game if they roll 
*their point-value; however, if they roll a 7 first (i.e. before rolling their "point") they lose. 
*
*The player can keep rolling until they roll their "point" (in which case they win), or they 
*roll a 7 (in which case they loose).
*
*
*	NOTE: The following code is only one 'model' of the Casino Craps game.
*		Try not to get trapped-into just this way of thinking about the game. Feel free
*		to re-model (think/describe the game in your own way)
*/
class Craps
{
	static boolean firstTime = true;
	static boolean craps	 = false;
	static boolean playPointGame = false;
	static int credits 	 = 10;	//example 10credits to start
	
	public static void main (String[] args)
	{
		//WELCOME
		System.out.println("Welcome");
		
		do{
			askIfLikeToPlay();
			printCredits();
			askPlayerToRoll();
			int rolled = 7;//rollDice();
			System.out.println("You rolled: "+rolled);
			checkPlayPointGame( rolled );
			
			if( playPointGame )
			{
				playPointGame();
			}else{
				playCraps();
			}
		
		}while( !craps );
	}
	
	static void playCraps()
	{
		System.out.println("do - play craps code");
		simulateWinOrLoose();
	}
	
	static void playPointGame()
	{
		System.out.println("do - play point game code");
		simulateWinOrLoose();
	}
	
	static void checkPlayPointGame(int rolled)
	{
		if ( rolled == 7 || rolled == 11 || rolled == 2 
				|| rolled == 3 || rolled == 12)
		{
			playPointGame = false;
		
		}else{
			playPointGame = true;
		}
	}
	static int rollDice()
	{
		Random random = new Random();
		int die1 = random.nextInt(6) + 1;
		int die2 = random.nextInt(6) + 1;
		int rolled = die1 + die2;
		return rolled;
	}
	static void printCredits()
	{
		System.out.println("Credits: "+credits);
	}
	
	static void askPlayerToRoll()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press Enter to Roll");
		String userInput = scanner.nextLine();
		
		if(userInput.equals(""))
		{
			
		}else{
			System.out.println("quitting...");
			System.exit(-1);
		}
	}
	static void askIfLikeToPlay()		//definition
	{
		if( firstTime )
		{
			System.out.println("play");
			firstTime = false;
		}else{
			System.out.println("play again");
		}
	}
	
	static void simulateWinOrLoose(){
		if( Math.random() > .5){
			System.out.println("Simulated Win");
			credits+=5;
		}else{
			System.out.println("Simulated Loose");
			System.out.println("Setting craps to true");
			craps = true; //set craps boolean to true
			System.out.println("game will now end...");
		}
	}
}