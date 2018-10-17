class DecoyDuck extends Duck {
	
	DecoyDuck(){
		quackBehavior = new MuteQuack();	
		flyBehavior   = new FlyNoWay();
	}
	
	void display() {
		System.out.println("DecoyDuck.display()");
	}
		
}
