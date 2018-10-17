/*
 * No Change here
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
	
	void fly() {
		System.out.println("<<"+this.getClass().getName()+" fly style>>");
	}

	//Force sub-classes to implement a display() method
	abstract void display();

}
