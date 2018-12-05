/*
 * Below, we have declared a ClassX and a ClassY, 
 * with a doX() and doY() method respectively.
 * The Runner creates a ClassX Object and calls its
 * doX() method, within which, a ClassY Object is
 * created and its doY() method called.
 * The println()'s show the chain of method calls.
 */
class Runner{
	public static void main(String[] args){
		System.out.println("main(...)");
		ClassX x = new ClassX();	//Create ClassX Object
		x.doX();					// call its 'doX()' method
		System.out.println("main(...): program over");

	}//program over
}
class ClassX{
    void doX(){
		System.out.println("doX(): ClassY.doY() called");
	    ClassY y = new ClassY();	//Create ClassY Object
		y.doY();					// call its 'doY()' method
		System.out.println("doX(): returning to main(...)");

	}//returns to main(...)
}

class ClassY{
    void doY(){
		System.out.println("doY(): empty");
	    //...
		System.out.println("doY(): returning to doX()");
		
	}//returns to doX()
}