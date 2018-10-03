/**
 *	Here is a possible design to allow a Person object to have
 *	either a Cat _or_ a Dog (or both).
 *	This design-choice however, is not very "extensible" (new term).
 *  Why not? 
 *	(Consider what you have to do to allow for a pet Rabbit, Snake, Turtle...)
 */
class Person{				
	String name;					
	
	//Possible design: attributes
	Dog dog;
	Cat cat;
	
	public Person(String aName){	
		name = aName;
	}
	
	//Possible design: methods
	void setPet(Dog aDog){
		this.dog = aDog;
	}

	void setPet(Cat aCat){
		this.cat = aCat;
	}
	//------------------
	public String toString(){
		String printString = "Person: "+name+"\n"+dog;
		return printString;
	}
}	
