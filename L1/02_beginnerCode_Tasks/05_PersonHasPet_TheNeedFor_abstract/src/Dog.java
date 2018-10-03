
class Dog extends Pet{
	
	Dog(String aDogName){
		super(aDogName);		
		sound = "woof";			//DogSound "woof" (Specific to Dog type) assigned
	}
	/**
	 *	Here we "override" (new term) Pet.toString()
	 *	and 'extend' it...
	 *	Note: we call super.toString() (i.e. the super-class's toString() method)
	 *		& then add to it ("+ makes sound: "...)
	 */
	public String toString(){
		String printString = super.toString() + " makes sound: "+sound;
		return printString;
	}
}

