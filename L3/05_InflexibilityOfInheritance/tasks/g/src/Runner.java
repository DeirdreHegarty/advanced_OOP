/**
 * This example puts all the previous examples together. 
 * TASK: To test if you understand the example well - see if you can 
 *	add a class for a DecoyDuck with a FlyNoWay fly behaviour and a MuteQuack quack
 */
class Runner
{
	public static void main(String[] args){
		System.out.println("Welcome to the duck show");
		System.out.println("On display today...");
		Duck[] ducks = new Duck[]{ new RedHeadDuck(), 
									new MallardDuck(),
									new RubberDuck(),	
									new DecoyDuck()	
									};
		System.out.println();								
		demonstrateDucks(ducks);

		System.out.println("************************************************");

		// change 2nd duck FlyBehavior & QuackBehavior
		ducks[1].setFlyBehavior( new FlyNoWay() );
		ducks[1].setQuackBehavior( new Squeak() );
		demonstrateDucks(ducks);

	}
	
	/*
	 * No need for 'instanceof' code now! This means that this
	 *	polymorphic method no longer needs to be altered.
	 *	As such, this solution supports the Open-Closed principle
	 */
	static void demonstrateDucks(Duck[] duckArray){
		
		for (Duck d : duckArray){
			d.display();			

			System.out.print("\t, then it swims like this: ");
				d.swim();				
			
			System.out.print("\t, and makes a ");
				d.quack();		
					
			
			System.out.print("\t, and flys off: ");
				d.fly();	
			
			System.out.println("\n\n");
		}
	}
}