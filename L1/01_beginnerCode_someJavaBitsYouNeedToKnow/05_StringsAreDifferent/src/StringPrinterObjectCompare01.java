/*Copy of previous example*/
class Runner{
	public static void main(String[] args){
		String  s = new String("text");
		System.out.println(s);				//Prints "text" 
		s = new String("text");
		System.out.println(s);				//Also prints "text"
	}
}
/*
* Question: how are we going to check if the reference 's' 
*			"refers to" a different Object after each assignment?
*/