class Runner
{
	public static void main(String[] args)
	{
		Duck[] ducks = new Duck[]{ new RedHeadDuck(), new MallardDuck()};
		System.out.println();
		
		demonstrateDucks(ducks);
	}
	
	//A polymorphic method designed to work over each element in a 
	//	Duck array, and call all of the methods on each Object
	//	(i.e. all methods in the Duck interface)
	static void demonstrateDucks(Duck[] duckArray){
		for (Duck d : duckArray){
			d.display();			//object specific
			d.quack();				//inherited from Duck or overridden
			d.swim();				//inherited from Duck or overridden
			d.fly();				//inherited from Duck or overridden
			System.out.println();
		}
	}
}