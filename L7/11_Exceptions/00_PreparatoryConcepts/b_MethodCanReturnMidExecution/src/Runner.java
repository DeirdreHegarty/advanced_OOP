/*
 * Below, the main(...) calls the showLenghtOfText(:String)
 * which accepts a String as argument, and adds text to 
 * show how long the argument is in characters.
 * 
 * The first call passes 'null' to cause an issue, and show 
 *	and example of why you might return from a method
 *	mid-execution if some condition is true.
 */
class Runner{
	public static void main(String[] args){
		String lengthOfNull;
		String lengthOfText;
		
		System.out.println("Passing: null");		//pass null and print result
		lengthOfNull = showLenghtOfText( null );
		System.out.println("result: "+lengthOfNull);
		
		System.out.println("Passing: text");		//pass text and print result
		lengthOfText = showLenghtOfText( "text" );
		System.out.println("result: "+lengthOfText);
		
	}

	static String showLenghtOfText(String passedIn){
		if( passedIn == null ){		//if String passedIn is null
			return "error";			//return early
		}
		String passedInLength;
		passedInLength = passedIn+":is "+passedIn.length()+" characters long";
		return passedInLength;
	}
}
