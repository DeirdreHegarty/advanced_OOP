abstract class Duck {	
 
	Duck() {
		System.out.println(" a "+this.getClass().getName());
	}
 
	//Assumption: ALL Ducks can swim - all subclasses inherit this method, and can be asked to swim()
	void swim() {
		System.out.println("<<"+this.getClass().getName()+" swim style>>");
	}
	
	//Force sub-classes to implement a display() method
	abstract void display();

}
