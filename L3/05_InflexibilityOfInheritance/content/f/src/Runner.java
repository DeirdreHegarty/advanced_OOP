/**
 * This code example, shows how the references 'f1', 'f2', and 'q' 
 * can  be assigned to any objects that implement the 
 * interfaces 'FlyBehaviour' and 'QuackBehaviour' respectively.
 * The code example's purpose is to re-enforce that this can be done, before leading
 * to the next example where it is used.
 */
class Runner
{
	public static void main(String[] args){
		FlyBehavior f1 = new FlyWithWings();
		f1.fly();
		
		FlyBehavior f2 = new FlyDisabled();
		f2.fly();
		
		QuackBehavior q = new Quack();
		q.quack();
		
		//...= new Squeak();
		
		//...= new MuteQuak();
	}
}