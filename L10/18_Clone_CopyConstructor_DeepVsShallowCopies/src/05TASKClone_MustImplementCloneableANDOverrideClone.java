/**
 * As seen in the previous example, you _must_ implement the Cloneable interface
 * in order for an Object to be cloneable, but, you must also
 * override 'clone()'.
 *	TASK: 01) How can you implement Cloneable without having to implement 'clone()'
 *		  02) Why doesn't the call to 'a.clone()' cause Object.clone() to be
 *				executed: after all, Age extends Object? 
 */

 class Age implements Cloneable{
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
 
 public String toString() { 					
    return "["+age+"]"; 						
  }
}

class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Age a = new Age(1);
		Age b = (Age)a.clone();
	}
  
}
