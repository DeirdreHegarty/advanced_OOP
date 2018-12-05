/** 
 * @see http://docs.oracle.com/javase/tutorial/java/generics/types.html
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
class Box<T> {
    // T usually used to stand for "Type" (i.e. any type)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
class Blob{
	int x;
	Blob(int anX) { x = anX; }
	public String toString(){ return "Blob:"+Integer.toString(x); }
}
class Test{
	public static void main(String[] args){
		Box<Integer> boxOfInteger = new Box<>();				//"...new Box<>()" instead of "new Box<Integer>()" (as of Java 7)
		System.out.println("adding 4 to boxOfInteger");
		boxOfInteger.set(4);									//avail of auto-boxing (as of Java 5)
		Integer i = boxOfInteger.get();								//no cast required: type-safe
		System.out.println("contents: " + boxOfInteger.get() );
	
		Box<String> boxOfString = new Box<>();
		System.out.println("adding \"text\" to boxOfString");
		boxOfString.set("text");	
		String s = boxOfString.get();								//no cast required: type-safe
		System.out.println("contents: " + boxOfString.get() );
		
		Box<Blob> boxOfBlob = new Box<>();
		System.out.println("addi'new Blob(...)' to boxOfBlob");
		boxOfBlob.set( new Blob(47) );	
		Blob b = boxOfBlob.get();									//no cast required: type-safe
		System.out.println("contents: " + boxOfBlob.get() );
		
		
	}
}