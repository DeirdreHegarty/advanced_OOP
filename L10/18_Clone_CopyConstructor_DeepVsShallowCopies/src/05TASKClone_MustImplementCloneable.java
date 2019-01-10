/**
 * You _must_ implement the Cloneable interface:
 *		https://docs.oracle.com/javase/7/docs/api/java/lang/Cloneable.html
 *	in order to be able to call clone() on an object.
 *
 *	TASK: 1) Is it a compile-time or a run-time error
 *		  2) Explain why? 	
 */
//import java.util.*;
class Age {//implements Cloneable{
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
  public Age clone() throws CloneNotSupportedException{		
	Age clone = (Age)super.clone();								
	return clone;
  }
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
