/*
 * Same code as the previous example, except now improved to ask
 *  for a non-zero number if a zero is entered. It still needs
 *  work though as if you enter two zeros the program terminates.
 */

 
import java.util.Scanner;
class DividerWithBetterExceptionHandler{
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
		try{								//"try-block"
			System.out.print( i1+" / "+i2);				//print entered int's
			result = i1/i2;								//divide entered int's
		
		}catch(ArithmeticException ae){		//"catch-block" 
			System.out.println("\n\n"+"in catch(ArithmeticException ae){} block");
			System.out.println("Handling the Exception"); //ADDED: ask again!
			System.out.println("The second number must be greater than zero - enter again");
			i2 = scanner.nextInt();
			result = i1/i2;
		}
		
		System.out.println("result = "+ result );		//print division result		
		
		checkIfProgramContinues();	//check if the program continues to execute afterwards
	}
	
	static void checkIfProgramContinues(){
		System.out.println("\n\n"+"continue program as normal.");	
	}
}
/*
 * Above, you can see the catch-block is where you can write code to "handle"
 * an Exception. 
 * This example has a better handler - it asks a second-time if the number
 *	entered was zero. However, it still needs work as it needs to repeat code
 *  (i.e. the 'result = i1/12;' division  is repeated) and the code is quite
 *  fragmented.
 *	Also, it doesn't handle the event when a zero is entered twice.
 */