/**
 * Example to show that you cannot access
 * an object's "instance" methods
 * from a "static" context (/block-of-code)
 */
class Person
{
	int age;
	String name;
	
	static void sayHello(){			//a 'static' context/block
		String name = getName();	// Attempted access. Won't compile
		System.out.println("Hello from"+ name);
	}
	
	String getName(){				//An 'instance' method
		return this.name;
	}
}
