class OldBox {
    private Object object;

    public void set(Object object) { 
    	this.object = object; 
    }
    public Object get() { 
    	return object; 
    }
}
class GenBox<T> {
    // T usually used to stand for "Type" (i.e. any type)
    // legal identifier - it replaces for whatever type is passed
    private T t;

    public void set(T t) { 
    	this.t = t; 
    }
    public T get() { 
    	return t; 
    }
}
// blob is wrapper around int
class Blob{
	int x;
	Blob(int anX) { 
		x = anX; 
	}
	public String toString(){ 
		return "Blob:"+Integer.toString(x); 
	}
}
class Runner{
	public static void main(String[] args){
		// ************************** OLDBOX *************************************
		OldBox oldbox = new OldBox();
		System.out.println("adding 4 to box");
		oldbox.set(4);								//works (as of Java 5): auto-boxing 

		// Integer i = box.get();			//no-compile (needs a cast)
		Integer i = (Integer)oldbox.get();	//no-compile (needs a cast)

		System.out.println("contents: " + oldbox.get() );
		
		System.out.println("adding \"text\" to box");
		oldbox.set("text");	        		//also works: String--|>Object

	    // String str = oldbox.get();	  	//no-compile (needs a cast)
	    String str = (String)oldbox.get();	//no-compile (needs a cast)
		System.out.println("contents: " + str );
		
		System.out.println("adding 'new Blob(...)' to box");
		oldbox.set( new Blob(47) );  		//also works: Blob--|>Object
		//Blob b = oldbox.get();     		//no-compile (needs a cast)
		System.out.println("contents: " + oldbox.get() );

	    // negative affect of object:
	    // * need to cast
	    // * If want list of specific type - no way of checking if all types are same
	    // * not type-safe (could pass wrong type)

		// ************************** GENBOX *************************************
		GenBox<Integer> boxOfInteger = new GenBox<>();// "new GenBox<>()" (Java 7)
		System.out.println("adding 4 to boxOfInteger");
		boxOfInteger.set(4);									
		Integer j = boxOfInteger.get();					//no cast needed: type-safe
		System.out.println("contents: " + boxOfInteger.get() );
	    // no casting was required above
	    // no longer an object - technically an integer

	    // boxOfInteger.set("4"); // now this will throw an error
	    // ensures that only integers will be passed - homogeneous & type safe
		
	    // each box has ONE TYPE ONLY
		GenBox<String> boxOfString = new GenBox<>();
		System.out.println("adding \"text\" to boxOfString");
		boxOfString.set("text");	
		String s = boxOfString.get();				    //no cast needed: type-safe
		System.out.println("contents: " + boxOfString.get() );
		
		GenBox<Blob> boxOfBlob = new GenBox<>();
		System.out.println("adding 'new Blob(...)' to boxOfBlob");
		boxOfBlob.set( new Blob(47) );	
		Blob b = boxOfBlob.get();								//no cast needed: type-safe
		System.out.println("contents: " + boxOfBlob.get() );
		
		
	}
}