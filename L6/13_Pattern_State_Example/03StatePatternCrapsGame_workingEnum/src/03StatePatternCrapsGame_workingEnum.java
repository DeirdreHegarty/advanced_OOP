/*
*This work by Rob Cleary is licensed under a Creative Commons AttributionShareAlike
*3.0 Unported License. Based on a work at www.usethetools.net. Permissions beyond
*the scope of this license may be available via usethetoolsinstructor1@gmail.com.
*/
import java.util.*;
class Runner{
	public static void main(String[] args){
		GameController game = new GameController();
		game.start();
	}
}
enum StateName{ CRAPS, POINT, WIN, LOOSE };
class GameController{
	static Map<StateName, CrapsGameState> possibleStates = new HashMap<StateName, CrapsGameState>();
    static CrapsGameState gameState;
	
	GameController(){
		possibleStates.put( StateName.CRAPS, new CrapsState() );
		possibleStates.put( StateName.POINT, new PointState() );
		possibleStates.put( StateName.WIN, 	 new WinState() );
		possibleStates.put( StateName.LOOSE, new LooseState() );
		gameState = possibleStates.get(StateName.CRAPS);
	}
	void start(){
		while(true){
			UIHandler.askPlayerToRoll();
			play(Dice.rollDice());//UIHandler.userInputTestRollValue());	
		}
	}
	
    void play(int rolled){
        gameState.play(rolled); //"delegation" to this.gameState.play() (i.e. INITIAL 1st time)
    }
    static void setState(StateName aStateName){
		System.out.println("setState( :"+aStateName+")");
        gameState.doExitActivity();				// doExit on state we're leaving
		gameState = getState(aStateName);		// change state
		gameState.doEnterActivity();			// doEnter on new state
    }
	static void setState(StateName aStateName, int rollValue){
        CrapsGameState changeState = getState(aStateName);
		if(changeState instanceof PointState){
			((PointState)changeState).storePointValueAs(rollValue);
		}
		setState(aStateName);		
    }
	static CrapsGameState getState(StateName aStateNameName){
		return possibleStates.get(aStateNameName);
	}
}

abstract class CrapsGameState{
	void play(int rolled){ 
		; //default: entry/doNothing	
	}
	void doEnterActivity(){
		; //default: entry/doNothing
	}
	void doExitActivity(){
		; //default: entry/doNothing
	}
	
	public String toString(){
		return this.getClass().getSimpleName();
	}
}

class CrapsState extends CrapsGameState{
	void play(int rolled){ 
		System.out.println( "CrapsState.play()" );
		if( rolled == 7 || rolled == 11){
			GameController.setState(StateName.WIN); 
		
		}else if ( rolled == 2 || rolled == 3 || rolled == 12 ){
			GameController.setState(StateName.LOOSE);
		}else {
			GameController.setState(StateName.POINT, rolled );
		}		
    }
}
class PointState extends CrapsGameState{
	int pointValue;
	
	void play(int rolled){
		System.out.println( "PointState.play()");
		if( rolled == pointValue ){
			resetPointValue();
			GameController.setState(StateName.WIN);
		}else if( rolled == 7 ){
			resetPointValue();
			GameController.setState(StateName.LOOSE);
		}else{
			; //do nothing
		}			
    }
	
	void storePointValueAs(int rolled){
		pointValue = rolled;
	}
	void resetPointValue(){
		pointValue = 0;
	}
}

class WinState extends CrapsGameState{
    
	void doEnterActivity(){
		System.out.println( "WinState.doEnterActivity()" );
		System.out.println( "increase credits");
	}
	void doExitActivity(){ 
		System.out.println( "WinState.doExitActivity" );
		GameController.setState(StateName.CRAPS);
    }
}

class LooseState extends CrapsGameState{
    
	void doEnterActivity(){
		System.out.println( "LooseState.doEnterActivity()" );
		System.out.println( "decrease credits");
	}
	void doExitActivity(){ 
		System.out.println( "WinState.doExitActivity" );
		GameController.setState(StateName.CRAPS);
    }
}
class Dice{
	static int rollDice()
	{
		Random random = new Random();
		int die1 = random.nextInt(6) + 1;
		int die2 = random.nextInt(6) + 1;
		int rolled = die1 + die2;
		System.out.println("...rolled: "+rolled);
		return rolled;
	}
}
class UIHandler{
	static void askPlayerToRoll()
	{
		String userInput = getUserInput("Press Enter to Roll");
		
		if(userInput.equals(""))
		{
			
		}else{
			System.out.println("quitting...");
			System.exit(-1);
		}
	}
	static String getUserInput(String msg){
		Scanner scanner = new Scanner(System.in);
		System.out.println(msg);
		return scanner.nextLine();
	}
	static int userInputTestRollValue(){
		String userInput = UIHandler.getUserInput("Enter a number between 2 and 12 to test");
		return Integer.parseInt(userInput);
	}
}