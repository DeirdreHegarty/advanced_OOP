// Add a constructor to set up the
// DecoyDuck's flyBehaviour and quackBehaviour
// in an appropriate way 
class RubberDuck extends Duck {
	
	RubberDuck(){
		quackBehavior = new Squeak();
		flyBehavior   = new FlyDisabled();
	}
	
	void display() {
		System.out.println("RubberDuck floats on the water");
	}
	
}
