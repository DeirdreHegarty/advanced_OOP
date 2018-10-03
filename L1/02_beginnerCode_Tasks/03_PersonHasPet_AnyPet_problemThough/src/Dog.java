class Dog{
	String name;

	Dog(String aDogName){
		this.name = aDogName;
	}
	
	public String toString(){
		String printString = "Dog: "+name;
		return printString;
	}
}