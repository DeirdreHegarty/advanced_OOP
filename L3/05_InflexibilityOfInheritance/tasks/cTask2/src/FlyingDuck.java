/*
 * New class: FlyingDuck can fly()
 *	intention: subclass this if you need to fly()
 *			else
 *  			subclass Duck
 */
abstract class FlyingDuck extends Duck{
	
	void fly() {
		System.out.println("<<"+this.getClass().getName()+" fly style>>");
	}

}
