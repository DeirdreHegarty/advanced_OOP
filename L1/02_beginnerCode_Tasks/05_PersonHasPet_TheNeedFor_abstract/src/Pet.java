/**
 * Note in this example we are adding an attribute to Pet
 * to describe what 'sound' they make...
 * I.e. A Dog makes the sound "woof", a Cat makes the sound "meoh" etc.
 *
 *	 We're just adding the attribute here in 'Pet',
 *	 but all sub-classes, (i.e. Cat and Dog), will "inherit" that.
 *
 *	(@see how Runner.taskPart1() works.)
 */
class Pet{
	String name;
	String sound;						//added attribute 'sound'
	
	Pet(String aPetName){
		this.name = aPetName;
	}
	
	public String toString(){
		String printString = "Pet: "+name;
		return printString;
	}
}