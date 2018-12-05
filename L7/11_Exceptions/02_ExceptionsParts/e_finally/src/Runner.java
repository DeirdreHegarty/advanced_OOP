/*
 * Execute the taskPart() methods
 * below individually 
 * (If you run both together the output may be confusing)
 */
class Runner {
	public static void main(String[] args){
		taskPart1();
		//taskPart2();
		
	}
	
	static void taskPart1(){
		System.out.println("\n\nFinally Always Runs - WITHOUT Exception");
		FinallyAlwaysRuns.demo(false);
	}
	static void taskPart2(){
		System.out.println("\n\nFinally Always Runs - WITH Exception");
		FinallyAlwaysRuns.demo(true);
	}
}