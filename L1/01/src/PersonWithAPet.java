class Person{				
	String name;					
	Pet pet;
	
	public Person(String aName){	
		this.name = aName;
	}

	void setPet(Pet pet){
		this.pet = pet;
	}
	public String toString(){
		String printString = "Person: "+name+"\n"+pet;
		return printString;
	}
}	
