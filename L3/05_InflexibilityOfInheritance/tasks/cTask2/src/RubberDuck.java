/* No longer need to override fly().
 *	FlyingDuck now has the fly() method 
 *	and RubberDuck can now just inherit 
 *	swim() and quack()
 */
 class RubberDuck extends Duck {
 
	//This is an improvement over the previous version.
	// We're overriding quack to make it "squeak" for the RubberDuck
	void quack() {
		System.out.println("<<"+this.getClass().getName()+" squeak sound>>");
	}
	
	void display() {
		System.out.println("RubberDuck floats on the water");
	}
}
