/*
 * This example is a re-cap to recall that both
 *	abstract class types and interface types can be used
 *	as the type of a reference.
 *
 * [Note: there's a compile error to be fixed here.]
 */
class Runner
{
	public static void main(String[] args){
		//Using a reference who's type is an abstract super-class...
		AbstractAnimal aa = new Dog();
		aa.makeSound();
		
		//Similarly, a reference who's type is an interface works...
		AnimalInterface ai = new Cat();		//compile error!
		ai.makeSound();						//	see file: "usethetools.net_Java_interfacesAsTypes.pdf" for help
	}
}