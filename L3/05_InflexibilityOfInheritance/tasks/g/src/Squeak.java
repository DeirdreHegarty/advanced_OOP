class Squeak implements QuackBehavior {
	
	Squeak(){
			System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void quack() {
		System.out.println("<<Squeak.quack(): squeak>>");
	}
}
