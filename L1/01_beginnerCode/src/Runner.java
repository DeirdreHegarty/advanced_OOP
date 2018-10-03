class Runner{
	public static void main(String[] args){
		Person p = new Person("Rob");

		// this will print Rob
		System.out.println(p.name);

		// this will print the OBJECT IDENTIFIER/"memory address"
		// java doesnt give access to actual memory 
		// but a mapping to a physical address
		System.out.println(p);	

		// demonstration of the mapping 
		// of a long number to a physical address
		long id = System.identityHashCode(p); 	//can pass ref to an object (like the one from above)	
		String hex = Long.toHexString(id); 		// convert long number to hex

		System.out.println(id);
		System.out.println(hex);

		// look at type (looks at class Person)
		// look at how to construct Person obj
		// allocate memory in accordance with type
		Person p2 = new Person("Meg");
		System.out.println(p2);	

		System.out.println( new Person("Billy") );

		// client code = code that directly 
		// access class attributes = BAD
		// e.g. System.out.println(p.name);
		// BETTER PRACTICE:
		// use methods to indirectly access attrs e.g. getName() 
		// which will be defines in class Person

		String p_string = p.getName();
		System.out.println(p_string);

		// amount of objects that you are allowed 
		// to create with java = 64 bits = long max

		System.out.println(Long.MAX_VALUE);

	}
}