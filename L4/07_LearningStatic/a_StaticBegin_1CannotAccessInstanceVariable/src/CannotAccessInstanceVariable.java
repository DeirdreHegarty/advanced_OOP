/**
 * Example to show that you cannot access
 * an object's "instance" variables
 * from a "static" context (/block-of-code)
 */
///*
class Person
{
	int age;
	String name;
	
	static void sayHello(){						//a 'static' context/block
		System.out.println("Hello from"+ name);
	}
}
//*/
