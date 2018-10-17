/*
 * This example attempts to show the issue with 
 *	trying to solve the problem by introducing 
 *	sub-class classifiers for 'FlyingDuck', 'NonFlyingDuck' 
 *	(etc.) to the ducks problem?
 *  
 *	Develop a solution to incorporate the 'DecoyDuck'
 *	  class into the inheritance hierarchy and answer the
 *	  question in the _TASK.txt after. 
 */
class Runner
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the duck show");
		System.out.println("On display today...");
		
		Duck[] ducks = new Duck[]{ 	new MallardDuck()
									, new RedHeadDuck()
									, new RubberDuck()
									, new DecoyDuck()		//ADD: DecoyDuck						
									};						// it quacks (as it inherits from Duck)
		System.out.println();								// How to fix that?
		
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray){
		
		for (Duck d : duckArray){
			d.display();			

			System.out.print("\t, then it swims like this: ");
				d.swim();				
			System.out.print("\t, and makes a ");
				d.quack();	
				
			//ADDING instanceof here so message only prints if
			//		the Object is a FlyingDuck type
			if( d instanceof FlyingDuck ){
				System.out.print("\t, and flys off: ");
					((FlyingDuck)d).fly();				//the cast is required now though
			}
			System.out.println("\n\n");
		}
	}
}