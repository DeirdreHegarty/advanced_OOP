/*
 * No Change here
 */
abstract class Duck {
	 
	Duck() {
		System.out.println("Creating Object: "+this);
	}
 
	void quack() {
		System.out.println("inherited Duck.quack() from 'abstract class Duck{...'");
	}
 
	void swim() {
		System.out.println("inherited Duck.swim() from 'abstract class Duck{...'");
	}
	
	void fly() {
		System.out.println("inherited Duck.fly() from 'abstract class Duck{...'");
	}

	//Force sub-classes to implement a display() method
	abstract void display();

}
