class RedHeadDuck extends Duck {
 
	RedHeadDuck() {
		quackBehavior 	= new QuackDisabled();			//quackBehavior attribute is inherited
		flyBehavior 	= new FlyDisabled();			//flyBehavior attribute is inherited

	}
 
	void display() {
		System.out.println("RedHeadDuck shows its feathers");
	}
}
