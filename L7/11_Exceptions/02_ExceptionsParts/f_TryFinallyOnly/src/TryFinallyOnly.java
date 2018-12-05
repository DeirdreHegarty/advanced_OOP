/**
 *	Showing a "finally{}" block connected to a try-block only.
 *  I.e. Without a catch-block. This is ok. You can have:
 *		a) a try{}catch(Exception e){}
 *		b) a try{}catch(Exception e){}finally{}
 *		c) a try{}finally{}
 *	
 *	As there is no handler (or catch-block) below, 
 *	if the Exception is thrown, finally will run, but then
 *	the Exception will cause the program to terminate.
 *
 *  Note also, that we need to declare 
 *		...throws Exception
 *  or the code will not compile; try remove it and see the 
 *  compile error. More on this next
 */
class TryFinallyOnly
{
	 static void demo(boolean booleanArgument) throws Exception
	 {
		System.out.println("Going to sleep now for 3 seconds");
		try{

			Thread.sleep(3000);
		 
			if(booleanArgument == true){
				System.out.println("Throwing a java.lang.Exception");
				throw new Exception();
			}
			System.out.println("statement after 'throw new Exception();'");
		 
		}finally{
			System.out.println("in finally");
		}
	   
	 }
}