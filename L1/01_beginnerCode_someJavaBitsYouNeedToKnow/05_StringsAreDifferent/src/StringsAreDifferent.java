/*Copy of "StringPrinterObjectCompare02.java" except
*	now using constant String-literal on the right hand-side of the 
*	assignment instead of _new String("text")_ - everything else the same
*/
class Runner{
	public static void main(String[] args){
		String s1 = "text";		//NEW: use "text" instead of new String("text")
		System.out.println(s1);				 
		String s2 = "text";		//NEW: use "text" instead of new String("text")
		System.out.println(s2);				
		
		boolean isSameObject = s1 == s2;
		System.out.println( isSameObject );		//If not equal, two different Objects
	}
}
/*
*	What mysterious output?? It runs to produce "true" now... as if to say there is 
*								now only one Object? 
*/