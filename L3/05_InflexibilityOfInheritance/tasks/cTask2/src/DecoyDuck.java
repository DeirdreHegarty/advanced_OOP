/*
 * ADDED: this class to represent a DecoyDuck
 */
 class DecoyDuck extends Duck { //extends FlyingDuck{ //?
	
	 void display() {
		System.out.println("DecoyDuck floats on the water");
	}
	
}
/*
 * This time, instead of trying the approach to 
 *	override the problem methods to do nothing, we are
 *  trying to use inheritance only: i.e. find the 
 *	right class to inherit from. We are trying to 
 *	solve the problem by designing a suitable class
 *	hierarchy. 
 */

