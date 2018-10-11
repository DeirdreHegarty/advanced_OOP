
abstract class Bird
{
	String name;		//note all subclasses can inherit 		
	boolean sings;

	Bird()
	{
		System.out.println("Bird()");
		sings = true; 	// default sings
	}

	// abstract methods don't get a body
	abstract void sing();
	
	boolean sings()
	{
		return sings;
	}

}