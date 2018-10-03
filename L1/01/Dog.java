class Dog extends Pet{
	Bone bone;

	Dog(String name, String gender){
		super(name, "Woof", gender);
		this.bone = new Bone();
	}

	public String toString(){
		String printString = super.toString() + " , item: "+bone+ "\n}";
		return printString;
	}
}