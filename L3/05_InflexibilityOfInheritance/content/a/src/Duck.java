/*
 * Abstract class defines "the Duck interface", 
 *	i.e. what someone would expect a Duck can do.
 *
 *  When we say "the Duck interface" what we mean is
 *	the set of methods that can be called through
 *	a reference of type Duck
 *	i.e. {Duck(), quack(), swim(), display()} below
 */
abstract class Duck {
	 
	Duck() {
		// print obj ref of current obj being created
		// this is important here - it will refer to the subclass
		// e.g. ReadHead@001
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
