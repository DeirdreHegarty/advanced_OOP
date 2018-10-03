class Runner{
	public static void main(String[] args){
		taskPart1();
		taskPart2();
		taskPart3();
	}
	
	
	/*taskPart1()
	 * Just try this out and see that it works.
	 * Imagine that you want to enforce a rule that
	 *  --All Pets have a sound--
	 */
	static void taskPart1(){	
		/**
		Person p1 = new Person("Rob");
		Cat mojo = new Cat("mojo");
		p1.setPet( mojo );

		System.out.println( p1 );		
		System.out.println("p1.pet.sound="+ p1.pet.sound ); 	//access the pet's sound
		
		//change to a Dog
		
		Dog fido = new Dog("fido");
		p1.setPet( fido );
		System.out.println( p1 );		
		System.out.println("p1.pet.sound="+ p1.pet.sound ); 	//access the pet's sound
		//Everything works fine!
		//*/
	}
	
	/*taskPart2()
	 * But then, because we have 'class Pet' the following 
	 *	code can break the rule (i.e. that all pet's will have a sound)
	 *
	 */
	 static void taskPart2(){
		/**
		//But then, because 'class Pet'
		Person p1 = new Person("Rob");
		Pet pet = new Pet("Pet");
		p1.setPet( pet );
		System.out.println( p1 );		
		System.out.println( "p1.pet.sound="+p1.pet.sound);	//null: what sound does a Pet make?
		//*/
		
		//	The key question here is:
		//	What sound does a Pet make?
	}
	
	/*taskPart3()
	 * Change the definition of the class Pet in Pet.java
	 *	from:
	 *		class Pet {...
	 *	to:
	 *		abstract class Pet{...
	 *	
	 *	Then try the following code and see that it doesn't work.
	 *	The Lesson: 
	 *		If you make a class 'abstract' you can't use 'new' on it.
	 *		(i.e. you can't create an object from a class declared 'abstract').
	 *		Abstract classes are intended for grouping common code that is to be
	 *			inherited to a family of sub-classes.
	 */
	static void taskPart3(){
		/**
			Pet pet = new Pet("Pet");
		//**/	
	}
	
}
