class Runner{
	public static void main(String[] args){
		String s1 = new String("text");		//NEW: use 's1' reference to store before
		System.out.println(s1);				 
		String s2 = new String("text");		//NEW: use 's2' reference to store after
		System.out.println(s2);				
		
		boolean isSameObject = s1 == s2;
		System.out.println( isSameObject );		//If not equal, two different Objects
	}
}
/*
* Answer: use == operator to check if 's' contains the same 
			object reference before and after
*/