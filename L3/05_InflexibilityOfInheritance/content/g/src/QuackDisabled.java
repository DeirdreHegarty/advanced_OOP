
class QuackDisabled implements QuackBehavior {
	QuackDisabled(){
		System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void quack() {
		System.out.println("<<QuackDisabled.quack(): Silence>>");
	}
}
