class Runner{
	public static void main(String[] args){
		taskPart1();
		taskPart2();
	}
	
	/*taskPart1()
	 */
	static void taskPart1(){
		Person p1 = new Person("Rob");
		//write code here to directly access p1's 'friend' attribute
		// and assign it the value of a new Person object with name "tim".
		// *Use print statements to verify what you have done to be correct.
	}
	
	/*taskPart2()
	 *This task part:
	 * (a) 	implement a ...setFriend(...) method in the class Person so
	 *		that the statement marked "//SetFriend" below works
	 * (b)	implement a ...getFriend() method in the class Person so
	 *		that the statmeent marked "//GetFriend" below works
 	 */
	static void taskPart2(){
	/**
		Person p1 = new Person("Rob");
		Person p2 = new Person("tim");
		
		p1.setFriend( p2 ); 							//SetFriend
		
		System.out.println("Robs friend is"				//GetFriend
								+p1.getFriend() );
	//*/
	}
}