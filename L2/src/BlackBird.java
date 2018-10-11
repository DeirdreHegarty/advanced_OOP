
class BlackBird extends FlyingBird
{

	BlackBird()
	{
		System.out.println("I can fly: "+ super.flys());
		System.out.println("Blackbird Constructor");
	}
	
	/** 
	* overriding FlyingBird sing()
	* technically just need one override to  
	* to satisfy abstract class Bird()
	*/

	void sing()
	{
		System.out.println("ChirpChirp I'm a Blackbird");
	}	
	
}