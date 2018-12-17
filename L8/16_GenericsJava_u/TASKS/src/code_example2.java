// http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeArguments.html#FAQ006
// same function on two different types
class Wrapper<T extends Comparable <T> > implements Comparable <Wrapper<T>> { 
  private final T theObject; 
  public Wrapper(T t) { theObject = t; } 
  public T getWrapper() { return theObject; } 
  public int compareTo(Wrapper <T> other) { return theObject.compareTo(other.theObject); } 
} 
class Person{
	public Person(){}
}
class Runner{

	public static void main(String [] args){
		Wrapper <String> wrapper0 = new Wrapper <String> ("Oystein"); 
		Wrapper <String> wrapper1 = new Wrapper <String> ("Oystein"); 
		Wrapper <Integer> wrapper2 = new Wrapper <Integer> (5);  
		Wrapper <Integer> wrapper3 = new Wrapper <Integer> (9);  
		// Wrapper <Person> wrapper4 = new Wrapper <Person> ();  // throws error because doesnt extend comparable


		System.out.println(wrapper3.compareTo(wrapper2)); // returns 1 (different)
		System.out.println(wrapper1.compareTo(wrapper0)); // returns 0 (equal)
	}
}
