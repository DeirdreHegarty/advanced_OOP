//WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class MallardDuck extends Duck implements Flyable, Quackable {


	void display() {
		System.out.println("MallardDuck shows its feathers");
	}

	public void fly(){
		// System.out.println("<< like a "+this.getClass().getName()+" >>");
		System.out.println("wheesh");
	}

	public void quack(){
		System.out.println("<< "+this.getClass().getName()+" noise >>");
	}
 
}
