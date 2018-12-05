/**	 
 * Until now we have been working with "runtime" Exceptions.
 * Here we are going to see an example of a "checked"
 * Exception (java.lang.Exception).
 * When using checked Exceptions, you must either
 *  catch the Exception (by wrapping in a try-catch block)
 *  OR...
 *  declare the Exception can be thrown in the method it occurs.
 *	OR...
 *	do both (which is legal, but can sometimes be unnecessary.
 *
 *	TASK: 1. Try to compile the following: observe the result.
 *		  2. Add the ...'throws Exception' at 1. and then 2.
 *			 (Compile each time and observe the result)
 */
import java.lang.Exception; 
class Runner
{
	 public static void main( String[] args) //throws Exception //2.
	 {
		taskPart1();
	 }
	 
	 static void taskPart1() //throws Exception					//1.
	 {
		throw new Exception();
	 }
}
/*
 * Above - when you add the 'throws Exception' to each method, 
 *	the code compiles. This is referred to as:
 *	"...throwing the Exception out of main"
 * Generally, it's not good practice - it's ok for this example, but
 *	don't get in the habit of doing it; it can cause problems in your
 *	code that are very hard to find/de-bug.
 *
 *	Try wrapping either the 'throw new Exception();' statement 
 *   or the 'taskPart1();' in a try-catch block and repeat the 
 *	 experiment.
 */
