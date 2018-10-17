//WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class RubberDuck extends Duck implements Quackable{
 
	void display() {
		System.out.println("RubberDuck floats on the water");
	}
	public void quack(){
		System.out.println("<< "+this.getClass().getName()+" noise >>");
	}
	
}
