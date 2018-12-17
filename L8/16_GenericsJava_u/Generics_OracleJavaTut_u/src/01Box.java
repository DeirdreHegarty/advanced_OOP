/** 
 * @see http://docs.oracle.com/javase/tutorial/java/generics/types.html
 */
class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}

class Blob{
	int x;
	Blob(int anX) { x = anX; }
	public String toString(){ return "Blob:"+Integer.toString(x); }
}
class Test{
	public static void main(String[] args){
		Box box = new Box();
		System.out.println("adding 4 to box");
		box.set(4);								//avail of auto-boxing (as of Java 5)
		Integer i = (Integer)box.get();							//no-compile assignment needs explicit cast
		System.out.println("contents: " + box.get() );
		
		System.out.println("adding \"text\" to box");
		box.set("text");	//avail of autoboxing
		//String s = box.get();								//no-compile assignment needs explicit cast
		System.out.println("contents: " + box.get() );
		
		System.out.println("adding 'new Blob(...)' to box");
		box.set( new Blob(47) );
		//Blob b = box.get();								//no-compile assignment needs explicit cast
		System.out.println("contents: " + box.get() );
				
	}
}