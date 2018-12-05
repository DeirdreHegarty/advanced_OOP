/**
 * Same code as the previous example, except now, the division operation
 * has been factored-out into a method: _divide(:int, :int):int_.
 * Note the "...throws ArithmeticException" appended to the method
 *		signature. (This is formally called the "Exception specification"). 
 * TASK: What happens if you remove the Exception specification from the
 *		 divide(..) method?
 */

import java.util.Scanner;
class DividerWithMethod{
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
			result = divide(i1, i2);								//divide entered int's
		
		}catch(ArithmeticException ae){		//ADDED "catch-block" 
			System.out.println("\n\n"+"in catch(ArithmeticException ae){} block");
			System.out.println("Handling the Exception");
			do{
				System.out.println("The second number must be greater than zero - enter again");
				i2 = scanner.nextInt();
			}while( i2 <= 0);
			result = divide(i1, i2);
		}

		System.out.println("result = "+ result );		//print division result		
		checkIfProgramContinues();	//check if the program continues to execute afterwards
	}
	
	static void checkIfProgramContinues(){
		System.out.println("\n\n"+"continue program as normal.");	
	}
	static int divide(int number1, int number2) throws ArithmeticException
	{
		return number1/number2;
	}
}
/*
 * Above, you can see the catch-block is where you can write code to "handle"
 * an Exception. 
 * This example has a better handler - it loops now to keep asking until a
 *	non-zero value is entered as the divisor. 
 */