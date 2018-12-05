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
	//TODO: write a getMessage for this Exception type
}

class RunBallThrower
{
	public static void main(String[] args)
	{
		try{
			decideWhatToThrow();	//see method below
		
		}catch(BallException b){
			System.out.println( b.getMessage());
			b.printStackTrace();
		}
		// Multiple, specific, exception handlers: Better Programming practice	
		//}catch(BaseBall b){  
		//	System.out.println("baseball");
		//}catch(RugbyBall rb){
		//	System.out.println("rugbyball");
		//}
		
	}
	
	static void decideWhatToThrow() throws BaseBallException, RugbyBallException
	{
		if ( Math.random() > .5 ) //50% of the time
		{
			throw new BaseBallException();
		
		}else{
			throw new RugbyBallException();
		}
	}
}







