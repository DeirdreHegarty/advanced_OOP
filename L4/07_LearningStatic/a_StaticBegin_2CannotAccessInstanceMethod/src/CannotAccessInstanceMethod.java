/**
 * This error is more commonly encountered as a
 * beginner programmer when inside: 
 * 		public static void main(String[] args){
 *			//...
 *	
 * as follows...
 */
class Person
{
	int age;
	String name;
	
	public static void main(String[] args){			//a 'static' context/block
		String name = getName();					// Attempted access. Won't compile
		System.out.println("Hello from"+ name);
	}
	
	String getName(){								//An 'instance' method
		return this.name;
	}
}
