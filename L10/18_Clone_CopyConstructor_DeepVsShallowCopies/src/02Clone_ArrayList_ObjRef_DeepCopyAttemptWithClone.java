import java.util.*;

class Age implements Cloneable{
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
  public Age clone() throws CloneNotSupportedException{		//added a clone() method
	Age clone = (Age)super.clone();								
	return clone;
  }
  /*
  public String toString() { 					//TASK: remove toString() to discover why
    return "["+age+"]"; 						// this is not working.
  }//*/
}

class CloneTest {
	public static void main(String[] args) {
		ArrayList<Age> ageList;
		ageList = new ArrayList<Age>( Arrays.asList( new Age(1), new Age(2), new Age(3) ) );
		System.out.println("ageList \t" + ageList);						
		
		ArrayList<Age> ageListClone = (ArrayList<Age>)ageList.clone();	
		System.out.println("ageListClone \t" + ageListClone);			
		
		System.out.println("\nageListClone.get(2).zeroAge()\n");
		ageListClone.get(2).zeroAge();							
		
		System.out.println("ageList \t" 	+ ageList);			
		System.out.println("ageListClone \t" + ageListClone);	
		System.out.println("...both get changed?");				
	}
  
}