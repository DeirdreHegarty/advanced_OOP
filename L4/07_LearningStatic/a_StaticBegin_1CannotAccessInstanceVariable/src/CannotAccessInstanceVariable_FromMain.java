/**
 * This error is more commonly encountered as a
 * beginner programmer when inside: 
 * 		public static void main(String[] args){
 *			//...
 *	
 * as follows...
 */
 //*
 class Runner{
	
	int runnerVariable = 1;					// An 'instance' variable
	
	public static void main(String[] args){	// A 'static' context/block
		System.out.println(runnerVariable); // Attempted access. Won't compile!
	}
 }
 //*/
 /*
  * It won't compile because runnerVariable is only 
  * accessible as the internals of a Runner Object:
  * i.e. using the 'dot' operator...
  *		Runner r = new Runner();
  *     System.out.println( r.runnerVariable ); //compiles ;-)
  */