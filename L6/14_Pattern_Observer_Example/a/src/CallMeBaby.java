/**
 *	This work by Rob Cleary is licensed under a Creative Commons Attribution-ShareAlike 3.0 Unported License. 
 *	Based on a work at www.usethetools.net. Permissions beyond the scope of this license may be available via 
 *	usethetoolsinstructor1@gmail.com
 */
 /**	TASK: 1. In the class Barbi, in the flirt() method, there is a call to
 *				aKen.callMeBaby() but the argument 'this' is commented-out...
 *				Uncomment it, and compile and run the code. Try to understand
 *				how it works... how does it work?
 *
 */
class Runner{
	public static void main(String[] args){
		Ken k = new Ken();
		Barbi b = new Barbi();
		b.flirt(k);
	}
}
class Ken{
	void callMeBaby(Barbi barbiRef){
		if( hasConfidence() && timeIsRight() ){
			barbiRef.call();
		}
	}
	boolean hasConfidence(){
		if(Math.random() > .4){
			System.out.println("Ken feels confident...");
			return true;
		}else{
			System.out.println("awe! Ken has a confidence issue...");
			return false;
		}
	}
	boolean timeIsRight(){
		if(Math.random() > .4){
			System.out.println("Ken feels the time is right...");
			return true;
		}else{
			System.out.println("awe! Ken doesn't feel it's the right time...");
			return false;
		}
	}
}
class Barbi{
	void flirt(Ken aKen){
		System.out.println("Hi Ken ;-)");
		System.out.println("...call me baby ;-)");

		//call back
		aKen.callMeBaby( this );		//Note the use of 'this'
	}									// to pass a Barbi ref' to Ken.
										// Ken can now "call back" Barbi
	void call(){			
			System.out.println("ring-ring...pick-up...Hi it's Barbi");
	}
}





