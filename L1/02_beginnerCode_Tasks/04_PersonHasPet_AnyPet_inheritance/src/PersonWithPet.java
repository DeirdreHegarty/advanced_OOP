/**
 *	Here is more 'extensible' design to allow a Person object to have
 *	either a Cat _or_ a Dog (or any other 'Pet' we define).
 *	This design is now "extensible".
 *  Why? 
 *	(See taskPart2() in the Runner.java file
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
