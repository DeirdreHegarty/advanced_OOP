/**
 *	A sample program to simulate a "file not found" Exception.
 *  Note: below, we use a try-catch block, to surround a call to 
 *	the java.util.Scanner(:File) constructor. 
 *	(This constructor throws a FileNotFoundException if the 
 *    fileName passed-in to the File constructor cannot be found). 
 *  TASK: How can you get the println("Hgh!...") below to execute?  
 *	@see http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#Scanner%28java.io.File%29
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
			Scanner fileScanner = new Scanner( new File(fileName) );
			
			System.out.println("Hgh!...this line doesn't execute?");
		
		}catch(FileNotFoundException ae){
			System.out.println("Exception thrown: file could not be found");
		}
		
		System.out.println("Program continues after catch");
		
	}
	
}