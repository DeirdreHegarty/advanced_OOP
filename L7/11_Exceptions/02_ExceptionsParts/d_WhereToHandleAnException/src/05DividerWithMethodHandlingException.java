/**
 * Same code as the previous example, except now, 
 * the "try catch" (Exception handler) is moved to be within the 
 * method divide now. 
 * With this approach we can remove the '...throws ArithmeticException'
 *	from the method signature, as we no longer want the caller to 
 *	write an exception handler, we've decided to take care of it.
 *
 * What do you think? Is this a better place to handle the Exception
 *  for this particular example? What are the positives? What are
 *  the negatives?
 */

import java.util.Scanner;
class DividerWithMethodHandlingException{
	static void askForNumbersAndDivide(){
		Scanner scanner = new Scanner(System.in);
		int i1;
		int i2;
		
		System.out.println("This program will divide one number by another");
		System.out.println("Please Enter an integer");
		i1 = scanner.nextInt();
		System.out.println("Please Enter an integer to divide the first by");
		i2 = scanner.nextInt();
		
		int	result = divide(i1, i2);					//call divide() method
		System.out.println("result = "+ result );		//no need for handler 		
		
		checkIfProgramContinues();	//check if the program continues to execute afterwards
	}
	
	static void checkIfProgramContinues(){
		System.out.println("\n\n"+"continue program as normal.");	
	}
	
	static int divide(int number1, int number2)  //no longer declaring throws ArithmeticException
	{
		int result = 0;
		try{								
			result = number1/number2;
			return result;
			
		}catch(ArithmeticException ae){		//ArithmeticException Handler here now!
			System.out.println("\n\n"+"in catch(ArithmeticException ae){} block");
			System.out.println("Handling the Exception");
			Scanner scanner = new Scanner(System.in);
			do{
				System.out.println("The second number must be greater than zero - enter again");
				number2 = scanner.nextInt();
			}while( number2 <= 0);
			result = divide(number1, number2);		//recursive call
		}
		return result;
	}
}
/*
 * Above the recursive call is a way of re-using the code in the try{} block.
 * Be careful with recursion - a good use of recursion controls that it cannot
 * recurse too many times: impulsive use of recursion can cause stackOverflow and 
 * to a lesser extent performance issues.
 */