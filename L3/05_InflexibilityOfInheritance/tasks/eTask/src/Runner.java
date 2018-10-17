/*
 * This example attempts to show the issue with 
 *	trying to solve the problem by using interfaces
 *	instead of inheritance.
 *  
 *  While this solution improves on inheritance in 
 *	a way, it causes a major maintenance issue
 *	which is not desirable.
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
									};						// but it quacks (as it inherits from Duck)
		System.out.println();								// How to fix that?
		
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray){
		
		for (Duck d : duckArray){
			d.display();			

			System.out.print("\t, then it swims like this: ");
				d.swim();				
			if( d instanceof Quackable )// WRITE CODE: "if d is an instance of a Quackable - i.e. implements quack()
			{
				System.out.print("\t, and makes a ");
				((Quackable)d).quack();		//then it can be asked to quack()
			}		
			
			if( d instanceof Flyable)// WRITE CODE: "if d is an instance of a Flyable - i.e. implements fly()
			{
				System.out.print("\t, and flys off: ");
					((Flyable)d).fly();	//then it can be asked to fly()
			}
			System.out.println("\n\n");
		}
	}
}