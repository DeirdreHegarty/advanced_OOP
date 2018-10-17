class MuteQuack implements QuackBehavior {
	MuteQuack(){
		System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void quack() {
		System.out.println("<< MuteQuack.quack(): Silence >>");
	}
}
