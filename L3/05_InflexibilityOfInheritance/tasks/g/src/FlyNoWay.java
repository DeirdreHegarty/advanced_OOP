class FlyNoWay implements FlyBehavior {
	
	FlyNoWay(){
		System.out.println("\t with a "+this.getClass().getName());
	}
	
	public void fly() {
		System.out.println("<< FlyNoWay.fly(): no flying >>");
	}
}
