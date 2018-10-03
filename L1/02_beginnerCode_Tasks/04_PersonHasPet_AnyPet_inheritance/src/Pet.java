/**
 * Note that in the previous design, the code in the class Cat
 * and Dog were pretty much identical. Now we've taken all that
 * repeated code and put it in one place (and one place only): i.e. 
 * in 'class Pet' - specific pet's like Cat, Dog, Snake, Turtle...
 * will now "inherit" this code (or get a copy for free).
 * 'class Pet' is said to be a "super class" (new term).
 */
class Pet{
	String name;
	
	Pet(String aPetName){
		this.name = aPetName;
	}
	
	public String toString(){
		String printString = "Pet: "+name;
		return printString;
	}
}