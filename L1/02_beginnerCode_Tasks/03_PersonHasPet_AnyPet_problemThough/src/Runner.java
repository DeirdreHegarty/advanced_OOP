class Runner{
	public static void main(String[] args){
		taskPart1();
		taskPart2();
	}
	
	/*taskPart1()
	 * Create a class to represent a Cat (in a file called 'Cat.java') 
	 * such that the 'new Cat(...)' statement below works.
	 */
	static void taskPart1(){
		/**
		Dog fido = new Dog("fido");		
		Cat mojo = new Cat("mojo");		//create a constructor 'Cat(:String)'.
		
		System.out.println( fido ); 	
		System.out.println( mojo );		//create a toString() in Cat for this.
		//**/
	}
	
	/*taskPart2()
	 * Complete the class Person and Cat 
	 * so that the following code works
	 */
	static void taskPart2(){	Person p1 = new Person("Rob");
		/**
		Person p1 = new Person("Rob");
		Dog fido = new Dog("fido");
		p1.setPet( fido );
		System.out.println( p1 );		//using the toString() in Person for this
		
		Cat mojo = new Cat("mojo");
		p1.setPet( mojo );
		System.out.println( p1 );
		//**/
	}
}
