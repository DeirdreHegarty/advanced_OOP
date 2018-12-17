/** 
 * @see http://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
 * Generic version of the Box class. Only now, where it's not being parameterized
 * 	is referred to as a "raw type" instantiation. 
 * @param <T> the type of the value being boxed
 */
class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

class Test{
	public static void main(String[] args){
		Box rawTypeBox = new Box();								//"raw type" instantiation
		System.out.println("adding 4 to rawTypeBox");
		// rawTypeBox.set(4);									//!compile warning! see with -XLint:unchecked
		//Integer i = rawTypeBox.get();							//!compile-error! explicit cast required for rawTypeBox 
		System.out.println("contents: " + rawTypeBox.get() );	
		
		
		
		
	}
}
// Raw Types are used for backwards compatibility with pre-Java1.5 code
//@SuppressWarnings("unchecked")			//Note: this annotation can be used to suppress compiler warnings
											//		just put it as the first line above the main() method