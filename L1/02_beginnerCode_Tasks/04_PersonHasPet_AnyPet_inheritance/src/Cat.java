//note:  "extends Pet" here - meaning: take a copy of the code from Pet
class Cat extends Pet{
	//only Cat specific code needed here (we don't have any yet)
	
	Cat(String aCatName){
		super(aCatName);		//Here 'super' re-directs execution to the 
								//	Pet(:String) constructor in Pet.java
								// 	It "re-uses" that code.
	}
}


//*********************************************
	// This old code has now been removed 
/*
   
    String name;

	Cat(String aName){
		this.name = aName;
	}
	
	public String toString(){
		String printString = "Cat: "+name;
		return printString;
	}

//*******************************************/
// It is stored in the super class Pet now only,
//  the "extends Pet" brings it in automatically