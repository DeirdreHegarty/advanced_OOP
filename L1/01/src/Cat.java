class Cat extends Pet{
	Fish fish;

	Cat(String name, String gender){
		super(name, "meow", gender);
		this.fish = new Fish();
	}
	public String toString(){
		String printString = super.toString() +", item: "+fish+ "\n}";
		return printString;
	}
}