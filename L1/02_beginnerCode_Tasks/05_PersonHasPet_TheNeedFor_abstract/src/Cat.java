
class Cat extends Pet{
	
	Cat(String aCatName){
		super(aCatName);		
		sound = "meoh";			//CatSound "meoh" (Specific to Cat type) assigned
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

