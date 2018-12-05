/**
 * Below shows the Java 7 (added) feature: "multiple catch"
 *  or "multi-catch"
 * [Explain when/why this is useful or was added to the language]
 */
class BallException extends java.lang.Exception
{
	public String getMessage(){
		return "this is a Ball";
	}
}
class BaseBallException extends BallException{
	public String getMessage(){
		return "this is a BaseBall";
	}
}
class RugbyBallException extends BallException{
	public String getMessage(){
		return "this is a RugbyBall";
	}
}

class RunBallThrower
{
	public static void main(String[] args)
	{
		try{
			decideWhatToThrow();
			
		}catch(BaseBallException | RugbyBallException b){  //Java 7 Feature: "multi-catch"
			b.printStackTrace();	
		}
		System.out.println("statement after catch(...){} block");
		
	}
	 
	static void decideWhatToThrow() throws BaseBallException, RugbyBallException
	{
		if ( Math.random() > .5 ) //80% of the time
		{
			throw new BaseBallException();
		
		}else{
			throw new RugbyBallException();
		}
	}
	
}







