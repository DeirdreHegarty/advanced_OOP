/**
 * As we're going to use java.util.Scanner
 * for some of the examples in this folder, 
 * here's a quick sample program to get you familiar 
 * with how we're going to use it. Our use is
 * a bit quick-and-dirty, but for short examples
 * it does the trick.
 */
import java.util.Scanner;		//1. import Scanner
class DemoUseOfScanner {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		//2. set to System.in
		
		System.out.println("Please Enter an integer");
		int userEnteredNumber = scanner.nextInt();		//nextInt() for an int
		System.out.println("You entered: "+userEnteredNumber);
		
		scanner = new Scanner(System.in); //resetting the Scanner
		
		System.out.println("Please Enter an String");
		String userEnteredString = scanner.nextLine();	//nextLine() for a String
		System.out.println("You entered: "+userEnteredString);
	}
}
/*
 * Above, for the sake of keeping the example v.simple, we 
 * reset the Scanner to 'scanner = new Scanner(System.in);'
 * before we switch from nextInt() to nextLine().
 * This is just a quick workaround to keep the example simple.
 * It's not relevant so we won't say anymore except that, in
 * general, it's not a recommended approach.
 */