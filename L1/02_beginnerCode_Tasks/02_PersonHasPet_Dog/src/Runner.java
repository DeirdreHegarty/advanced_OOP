class Runner{
	public static void main(String[] args){
		taskPart1();
		taskPart2();
	}
	
	/*taskPart1()
	 * Create a class to represent a Dog (in a file called 'Dog.java') 
	 * such that the 'new' statement below works.
	 */
	static void taskPart1(){
		/**
		Dog fido = new Dog("fido");		//create a constructor 'Dog(:String)'.
		System.out.println( fido ); 	//create a toString() in Dog for this.
		//**/
	}
	
	/*taskPart2()
	 * Complete the class Person and Dog 
	 * so that the following code works
	 */
	static void taskPart2(){	
		/**
		Person p1 = new Person("Rob");
		Dog fido = new Dog("fido");
		p1.setPet( fido );
		System.out.println( p1 );		//using the toString() in Person for this
		//**/
	}
}
