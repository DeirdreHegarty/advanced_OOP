/**
 * @see http://docs.oracle.com/javase/tutorial/extra/generics/methods.html 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
class Util{																//non-generic class
	
	  static <T>  void fromArrayToCollection(T[] a, Collection<T> c) {	//contains: generic-method
		for (T o : a) {
			c.add(o); // Correct
		}
	}
	//Note: to make static, you must put the 'static' before the <T>... as in:
	// static <T> 
}
class Test{
	public static void main(String[] args){
		Util util = new Util();	
		ArrayList<String> listString = new ArrayList<>(); 		//empty Collection
		System.out.println("empty list: " + listString );
		String[] strings = "born to run".split(" ") ;			//filled String[]
		
		Util.fromArrayToCollection( strings, listString );		//call parameterized method above
		System.out.println("list after: " + listString );
		
		
		
	}
}