/**
 * A sample program to simulate an Exception at runtime. 
 * (If you attempt to divide by zero, the Java Runtime 
 *	 will throw an ArithmeticException automatically.)
 *
 * You'll need to run the program: compare what happens
 * when you enter a 0 (zero) as the second number, against
 * what happens when you enter a non-zero number.
 * See the output.
 * TASK: Does the Exception effect the flow of execution?
 *		 If so, how? What gets executed in each case?
 */
import java.util.Scanner;
class Divider {
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
		
		System.out.print( i1+" / "+i2);				//print entered int's
		result = i1/i2;								//divide entered int's
		System.out.println(" = "+ result );			//print division result		
		
		checkIfProgramContinues();	//check if the program continues to execute afterwards
	}
	
	static void checkIfProgramContinues(){
		System.out.println("\n\n"+"continue program as normal");	
	}
}