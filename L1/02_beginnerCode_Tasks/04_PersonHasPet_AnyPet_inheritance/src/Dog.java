//note:  "extends Pet" here - meaning: take a copy of the code from Pet
class Dog extends Pet{
	//only Dog specific code needed here (we don't have any yet)
	
	Dog(String aDogName){
		super(aDogName);		//Here 'super' re-directs execution to the 
								//	Pet(:String) constructor in Pet.java
								// 	It "re-uses" that code.

	}
}


//*********************************************
	// This old code has now been removed 
/*
   
    String name;

	Dog(String aName){
		this.name = aName;
	}
	
	public String toString(){
		String printString = "Dog: "+name;
		return printString;
	}

//*******************************************/
// It is stored in the super class Pet now only,
//  the "extends Pet" brings it in automatically