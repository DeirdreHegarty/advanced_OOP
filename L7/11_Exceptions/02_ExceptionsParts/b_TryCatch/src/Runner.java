/*
 * Execute the taskPart() methods
 * below individually 
 * (If you run them together the output may be confusing)
 */
class Runner {
	public static void main(String[] args){
		taskPart1();
		//taskPart2();
		//taskPart3();
	}
	
	static void taskPart1(){
		System.out.println("Without an Exception Handler\n\n");
		Divider.askForNumbersAndDivide();
	}
	static void taskPart2(){
		System.out.println("With an Exception Handler\n\n");
		DividerWithExceptionHandler.askForNumbersAndDivide();
	}
	static void taskPart3(){
		System.out.println("With a Better Exception Handler\n\n");
		DividerWithBetterExceptionHandler.askForNumbersAndDivide();
	}
}