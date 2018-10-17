class MallardDuck extends Duck {
 
	MallardDuck() { 
		quackBehavior 	= new Quack();				//quackBehavior attribute is inherited
        flyBehavior 	= new FlyWithWings();		//flyBehavior attribute is inherited
	}
 
	void display() {
		System.out.println("MallardDuck shows its feathers");
	}
}
