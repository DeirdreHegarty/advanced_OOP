/*
 * Removed the fly() method here, that is now pushed down
 * to the FlyingDuck class.
 */

 abstract class Duck {
	
	Duck() {
		System.out.println(" a "+this.getClass().getName());
	}
 
	void quack() {
		System.out.println("<<"+this.getClass().getName()+" quack sound>>");
	}
 
	void swim() {
		System.out.println("<<"+this.getClass().getName()+" swim style>>");
	}
	
	//We have pushed the fly() method down to the FlyingDuck class.

	//Force sub-classes to implement a display() method
	abstract void display();

}
