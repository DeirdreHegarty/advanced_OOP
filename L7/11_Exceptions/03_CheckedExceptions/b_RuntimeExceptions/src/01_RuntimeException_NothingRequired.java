/**	 
 *	TASK: 1. Try to compile the following: observe the result.
 *		  2. Add the ...'throws Exception'
 *				observe the result
 *		  3. Change RuntimeException to just Exception
 *				compare the compile outputs in each case.
 *
 *  @see http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
 *  (particularly)
 *	http://docs.oracle.com/javase/tutorial/essential/exceptions/catchOrDeclare.html
 */
import java.lang.RuntimeException; 
class Runner
{
	 public static void main( String[] args)
	 {
		taskPart1();
	 }
	 
	 static void taskPart1() //throws RuntimeException
	 {
		throw new RuntimeException();
	 }
}

