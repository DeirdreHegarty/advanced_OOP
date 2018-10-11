**compile and run via cmd line**
```bash

# compile .java into another directory synthax
javac -d <destination> <file.java>

# example
javac -d ../bin *.java

# compile and run
javac -d ../bin *.java && java -cp ../bin <file>

```
#### Accessing an object
`Person@43556938` in an example of an **OBJECT IDENTIFIER**. Some people call this the "memory address", but java doesn't give access to actual memory. Java allows for a mapping to a physical address.

```java
		/** 
		 * demonstration of the mapping 
		 * of a long number to a physical address
		 * 
		 */

		Person p = new Person("Rob");
		long id = System.identityHashCode(p); 	// can pass ref to an object	
		String hex = Long.toHexString(id); 		// convert long number to hex

		System.out.println(id);
		System.out.println(hex);

		// This returns:
		// 1129670968
		// 43556938

```

#### Creating instance of a class
*INDIRECTION*  
**BAD PRACTICE:** Accessing the attributes of an object directly through client code (code that directly access class attributes) is bad practice `e.g. System.out.println(p.name);`  
**BETTER PRACTICE:** use methods to indirectly access attrs e.g. `getName()` which will be defined in `class Person`

*main method*
```java

Person p = new Person("Rob");

// print object attribute 'name'
System.out.println(p.name); 					// Rob

// print object identifier
System.out.println(p);							// Person@43556938

Person p2 = new Person("Meg");
System.out.println(p2);							// Person@3d04a311

System.out.println( new Person("Billy") ); 		// Person@7a46a697

// use method to print object attribute 'name'
String p_string = p.getName(); 					// Rob
System.out.println(p_string);

```

*Person.java*
```java

class Person{				//one class
	String name;			//one attribute
	
	Person(String aName){	//one constructor
		name = aName;
	}

	public String getName(){
		return name;
	}
}	

```

Note that above `System.out.println(p);` will print the object identifier `Person@43556938`, but the same does not apply to Strings. This is because String has a `toString` method.

```java
String  s = new String("text");
System.out.println(s);

// will return 'text'

```

If a `toString()` method is added to the above `Person` class what is printed will be different.  

*Person.java*   
```
	/*Newly added code - a "toString" method*/
	public String toString(){
		return name;
	}

```
Now instead of the object identifier `Person@43556938`, `Rob` is printed.  

**Constant Pool:** The constant pool table is where most of the literal constant values are stored. In the example below `s4 == s5` returns `true` because they reference the same object.  

`s1!=s2` because the keyword `new` forces a new object to be created.

```java

		String s1 = new String("text");			// keyword new used - new obj
		System.out.println(s1);				 
		String s2 = new String("text");			// keyword new used - new obj
		System.out.println(s2);		

		boolean isSameObject = s1 == s2;
		System.out.println( isSameObject );		// two objs are not the same
	


		String s4 = "moretext";
		System.out.println(s4);		
		String s5 = "moretext";	
		System.out.println(s5);

		System.out.println( s4 == s5 );        // both reference the same obj = therfore true

```
**ABSTRACT CLASS:** An abstract class, in the context of Java, is a superclass that cannot be instantiated and is used to state or define general characteristics. An object cannot be formed from a Java abstract class; trying to instantiate an abstract class only produces a compiler error.  

i.e. only instance of a subclass of an abstract class can be instantiated.  
```java

Pet pet = new Pet(); // NO

Pet pet = new Dog(); // YES - VALID

```

