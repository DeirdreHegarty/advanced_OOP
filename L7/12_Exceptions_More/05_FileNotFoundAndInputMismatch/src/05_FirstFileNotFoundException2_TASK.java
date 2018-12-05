/**
 * Same code as the previous example, except now, the file opening
 *  operation (via the call to new Scanner(...) ) has been factored-out 
 *	into a method: _tryToOpenFile(:String): void_.
 *  TASK:
 *     [Note 1: Compare 'ArithmeticException' & 'FileNotFoundException'
 *			    here: http://tinyurl.com/3brgfdm ] 
 * 		Given that you know the 'new Scanner(...)' can cause 
 *		an exception to be thrown (i.e. if 'fileName' can't be found);
 *		a 'FileNotFoundException'is thrown...
 *
 *      Explain the change needed to allow the code below to compile.
 *		(Give two options)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program attempts to open a file that may not exist");		
		System.out.println("Please Enter a file name that doesn't exist");
		String fileName = scanner.nextLine();
		try{
			tryToOpenFile(fileName);
		}catch(FileNotFoundException ae){
			System.out.println("Exception thrown: file could not be found");
		}
		
		System.out.println("Program continues after catch");
	}
	static void tryToOpenFile(String fileName)
			Scanner fileScanner = new Scanner( new File(fileName) );
			System.out.println("Hgh!...this line doesn't execute?");
		
	}
	
}