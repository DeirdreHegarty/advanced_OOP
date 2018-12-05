/**
 * Same code as the previous example, except now, a "try catch" block is added
 * which surrounds the division.
 * (A "try catch" can be called an "Exception handler"). 
 * TASK: Does the program continue after the Exception is thrown now?
 *		 (If so, what has changed?)
 */ 
import java.util.Scanner;
class DividerWithExceptionHandler{
	static void askForNumbersAndDivide(){
		Scanner scanner = new Scanner(System.in);
		int i1;
		int i2;
		
		System.out.println("This program will divide one number by another");
		System.out.println("Please Enter an integer");
		i1 = scanner.nextInt();
		System.out.println("Please Enter an integer to divide the first by");
		i2 = scanner.nextInt();
		int result;
		try{								//ADDED "try-block"
			System.out.print( i1+" / "+i2);				//print entered int's
			result = i1/i2;								//divide entered int's
			System.out.println("result = "+ result );	//print division result		

		
		}catch(ArithmeticException ae){		//ADDED "catch-block" 
			System.out.println("\n\n"+"in catch(ArithmeticException ae){} block");
			System.out.println("Handling the Exception");
			System.out.println("Print Error message: divisor cannot be zero");
		}
		
		checkIfProgramContinues();	//check if the program continues to execute afterwards
	}
	
	static void checkIfProgramContinues(){
		System.out.println("\n\n"+"continue program as normal.");	
	}
}
/*
 * Above, you can see the catch-block is where you can write code to "handle"
 * an Exception. 
 * This example doesn't handle it very well, it just prints a message.
 */