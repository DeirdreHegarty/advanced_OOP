/*
 * This example attempts to show the issue with 
 *	the solution to override subclass methods to do
 *	nothing.
 *  Run the code and study the output carefully. 
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
									, new DecoyDuck()		//ADD a DecoyDuck to see 
									};						// the problem worsen
		System.out.println();
		
		demonstrateDucks(ducks);
	}
	
	
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