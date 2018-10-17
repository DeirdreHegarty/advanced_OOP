abstract class Duck {
	FlyBehavior flyBehavior;				//choosing Composition over Inheritance: subclasses will inherit these attributes
	QuackBehavior quackBehavior;			//choosing Composition over Inheritance: subclasses will inherit these attributes
 
 	Duck() {
		System.out.println(" a "+this.getClass().getName());
		// you could assign default behaviors here
		//flyBehavior = new FlyWithWings(); 	// if you wanted this default behaviour
	}
	
	//Assumption: All Ducks swim... i.e. method implemented for default behavior
	void swim() {
		System.out.println("<<"+this.getClass().getName()+" swim style>>");
	}
	
	void fly() {
		flyBehavior.fly();		//"delegation"
	}
 
	void quack() {
		quackBehavior.quack();	//"delegation"

	}
 
	//"abstract" keyword forces subclasses to implement a display
	abstract void display();
}
