/*
 * This example shows an attempted solution to the previous
 *	example where the RubberDuck was fly()'ing when it shouldn't be 
 *	able to.
 *	Here, the RubberDuck class overrides the fly() method
 *	to do nothing.
 */
class Runner
{
	public static void main(String[] args)
	{
		Duck[] ducks = new Duck[]{ new RedHeadDuck()
									, new MallardDuck()
									, new RubberDuck()}; 
		System.out.println();
		
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray){
		for (Duck d : duckArray){
			d.display();			
			d.quack();				
			d.swim();				
			d.fly();				// RubberDuck not flying now
			System.out.println();
		}
	}
}