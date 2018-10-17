class Quack implements QuackBehavior {
	
	Quack(){
			System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void quack() {
		System.out.println("<<Quack.quack(): quack>>");
	}
}
