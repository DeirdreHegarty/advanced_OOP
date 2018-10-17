
class FlyWithWings implements FlyBehavior {
	
	FlyWithWings(){
		System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void fly() {
		System.out.println("<<FlyWithWings.fly(): flying>>");
	}
}
