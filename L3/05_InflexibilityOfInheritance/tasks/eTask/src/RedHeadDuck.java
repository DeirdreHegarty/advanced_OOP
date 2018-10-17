//WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class RedHeadDuck extends Duck implements Flyable, Quackable{
 
	void display() {
		System.out.println("RedHeadDuck shows its feathers");
	}
	public void quack(){
		System.out.println("<< "+this.getClass().getName()+" noise >>");
	}
	public void fly(){
		// System.out.println("<< like a "+this.getClass().getName()+" >>");
		System.out.println("wheesh");
	}
}
