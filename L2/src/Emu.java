
class Emu extends FlightlessBird
{
	Emu()
	{
		System.out.println("Emu Constructor");
	}
	
	/** 
	* overriding FlightlessBird sing()
	* technically just need one override to  
	* to satisfy abstract class Bird()
	*/

	void sing()
	{
		System.out.println("Coo Koo, I'm an E-M-uh");
	}
	
}