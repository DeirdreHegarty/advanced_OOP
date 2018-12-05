/*
 * An Exception is an Object.
 * It is a special type of Object that can be
 * returned to the caller of a method, even if
 * that method has a void return type!(??) 
 * (Yep, you read that correctly: don't feel bad
 *     if it's confusing, just accept it for now.)
 * It is best to return Exception Objects after some
 * unusual condition (or "exceptional circumstance")
 * has occurred
 */
 import java.lang.NullPointerException;   //an example of an Exception
									
class Runner {

	
	public static void main(String[] args){
		taskPart1();
		taskPart2(null);				//TASK: Change null to "some text" 
										//	then re-compile & execute
		System.out.println("continuing main method");
	}
	/*
	 * Showing that an Exception is an Object.
	 * It can be created like any other Object.
	 * (Note the 'import java.lang.NullPointerException;' above.)
	 */
	static void taskPart1(){
		NullPointerException e = new NullPointerException();
		System.out.println("after new NullPointerException");
	}
	
	/*
	 * Showing 'throw'.
	 * An exception can be "thrown" if some unusual 
	 *	condition becomes true. Below we're going to
	 *		'throw new NullPointerException();'
	 *	if a 'stringValue' argument is null.
	 */
	static void taskPart2(String stringValue){
		System.out.println("stringValue is: "+stringValue);				
		if( stringValue == null ){	
			System.out.println("in 'if(stringValue == null)' block");
			throw new NullPointerException();
		}else{
			
			System.out.println("in else{} block");
			System.out.println("continue program as normal");
		}
	}
}
/*
 *	Exceptions have classes - there are many types of them, if a particular
 *	exceptional circumstance occurs, you throw an Exception of that type.
 *	For example, if programming an automatic coffee machine, you might
 *	want to create an Exception class for "OutOfMilkException" and throw
 *  it if a sensor detects that the machine has run out of milk.
 *	(We will see that you can write your own Exception classes - but
 *    usually, if you search, you'll find one already exists that you
 *    can re-use; re-using existing Exceptions is highly recommended).
 *	If an Exception gets thrown, it disrupts the normal expected 
 *	flow of execution of the program.
 *  This can be seen above - when the Exception is thrown, the 
 *	  "continue program as normal" message never gets executed.
 *	Next we'll see how to "catch" or "handle" an Exception, where a 
 *  programmer can try to re-gain control of the execution...
 */