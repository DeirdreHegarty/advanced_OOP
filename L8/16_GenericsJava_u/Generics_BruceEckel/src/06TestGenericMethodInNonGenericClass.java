class ContentPrinter{
	String content;
	ContentPrinter(String value){
		content = value;
	}
	public String toString(){ return "print me: "+content;}
}

class X{
	//TASKS: (1) If you make doX() public (+) - can you put the 'public' keyword between '<T>' and 'void'
	//		 (2) Same question for 'static'
	<T> void doX(T aType){
		System.out.println( aType.toString() );
	}
}

class UseX{
	public static void main(String... x){
		X anX = new X();
		anX.doX( new ContentPrinter("tester"));
		anX.doX( new Integer(4) );
		anX.doX( new String("stringy") );
	}
}

