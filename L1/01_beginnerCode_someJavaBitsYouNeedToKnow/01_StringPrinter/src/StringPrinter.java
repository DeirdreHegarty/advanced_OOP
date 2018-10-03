class Runner{
	public static void main(String[] args){
		String  s = new String("text");
		System.out.println(s);				//Prints "text" not a 'String@e231ce21'... why?
		System.out.println(System.identityHashCode(s));	
		String hex = Long.toHexString(System.identityHashCode(s));
		System.out.println(hex);
		String className = s.getClass().getName()+" ";
		System.out.println(className);
}		

