/**
 *	A sample program to show how Exception Handlers 
 *  can be used to improve program robustness, while at the same
 *	time, maintaining a clear separation of error-handling code
 *	from program logic code.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
class Test {
	public static void main(String[] args)
	{
		
		System.out.println("Program attempts to read a number from the console");		
		System.out.println("Please Enter number");
		Scanner scanner = new Scanner(System.in);
		boolean repeat = true;
		
		do{
			try{
				int numberEntered = scanner.nextInt();
				repeat = false;	
			
			}catch(InputMismatchException ime){
				System.out.println("Exception thrown: InputMismatchException");
				System.out.println("Try again, please enter a _number_ only");
				scanner.nextLine(); //pause, ignore input
			}
		}while(repeat);
		
		System.out.println("Program continues after success");
		
	}
	
}