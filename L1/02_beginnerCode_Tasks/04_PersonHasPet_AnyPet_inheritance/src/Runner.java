class Runner{
	public static void main(String[] args){
		taskPart1();
		taskPart2();
	}
	
	
	/*taskPart1()
	 * Just try this out and see that it works 
	 * the same as before (only now with inheritance)
	 */
	static void taskPart1(){	
		//**
		Person p1 = new Person("Rob");
		
		Dog fido = new Dog("fido");
		p1.setPet( fido );
		System.out.println( p1 );		
		
		Cat mojo = new Cat("mojo");
		p1.setPet( mojo );
		System.out.println( p1 );
		//**/
	}
	
	/*taskPart2()
	 * Create a class to represent a pet Rabbit. Then try out 
	 *	the code below and compare this design to the previous one
	 *	(what advantages can you see to the new design?)
	 *	(@see http://www.oodesign.com/open-close-principle.html)
	 */
	static void taskPart2(){
		/**
		Person p1 = new Person("Rob");
		Rabbit bugs = new Rabbit("bugs");		
		p1.setPet( bugs );
		System.out.println( p1 );		
		//**/
	}
}
