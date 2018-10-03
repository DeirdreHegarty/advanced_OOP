/**  
  *			** No Change To this Class**
  *
  *		Just note:
  * 	The setPet(:Pet) method below will accept any object reference
  *		that is of type 'Pet' or a sub-class of 'Pet'.
  */
class Person{				
	String name;					
	
	//Design with Inheritance: only one attribute
	Pet pet;
	
	public Person(String aName){	
		name = aName;
	}
	
	//Design with Inheritance: only one method
	void setPet(Pet aPet){			//This method is said to be
		this.pet = aPet;			// "polymorphic" now
	}								// The same code can cater for many 
									// different types of Object

	public String toString(){
		String printString = "Person: "+name+"\n"+pet;
		return printString;
	}
}	
