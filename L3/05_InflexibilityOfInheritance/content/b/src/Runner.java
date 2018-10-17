/*
 * This example adds a RubberDuck (which is a toy duck)
 * This duck should not be able to fly, yet when we run
 * the demonstrateDucks(:Duck[]) method, it does exactly that? 
 */
class Runner
{
	public static void main(String[] args)
	{
		Duck[] ducks = new Duck[]{ new RedHeadDuck()
									, new MallardDuck()
									, new RubberDuck()}; //ADDING A RubberDuck
		System.out.println();
		
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray){
		for (Duck d : duckArray){
			d.display();			
			d.quack();				
			d.swim();				
			d.fly();				//which now fly()'s?
			System.out.println();
		}
	}
}