/*
 * Execute the taskPart() methods. 
 * Note - we now need 
 *	...throws Exception in each method or the code will not compile.
 * more on this next. (For now, just take note of it). 
 */
class Runner {
	public static void main(String[] args) throws Exception{
		taskPart1();
		taskPart2();
		
	}
	
	static void taskPart1()	throws Exception{
		System.out.println("\n\nWITHOUT Exception");
		TryFinallyOnly.demo(false);
	}
	static void taskPart2() throws Exception{
		System.out.println("\n\nWITH Exception");
		TryFinallyOnly.demo(true);
	}
}