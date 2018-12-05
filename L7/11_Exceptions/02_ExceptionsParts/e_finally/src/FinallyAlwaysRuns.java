/**
 *	Showing a "finally{}" block, and different execution paths.
 *	Note 1: Thread.sleep(3000); causes the program to pause for
 * 			3000 miliseconds (or 3 seconds).
 *
 *  TASK: 1. Try the code as-is below, first.
 *	  	  2. Change the ("/* 1.") line  to ("//* 1.") 
 *		  3. Change the ("/* 2.") line  to ("//* 2.")
 *		(Compile and execute after each task part)
 *
 *	In which case (above) does the finally{} block _not_ execute?
 *	(Caution: don't spend too much time, this may be a trick question)
 */
class FinallyAlwaysRuns
{
	 static void demo(boolean booleanArgument) 
	 {
		System.out.println("Going to sleep now for 3 seconds");
		try{

			Thread.sleep(3000);
			/* 1. 
			if( booleanArgument == true ){
				System.out.println("Throwing a java.lang.Exception");
				throw new Exception();
			}
			//*/
			/* 2. 
			System.out.println("statement after 'throw new Exception();'");
			//*/
		 
		}catch(Exception e){
			System.out.println("in the 'catch(Exception e){...} block");
		}finally{
			System.out.println("in finally");
		}
	   
	 }
}
