
abstract class FlyingBird extends Bird
{

	FlyingBird()
	{
		System.out.println("JVM making FlyingBird()");
	}
	
	boolean flys()
	{
		return true;
	}
	
	void sing()
	{
		System.out.println("Flying Bird sing()");
	} 
	
	
}