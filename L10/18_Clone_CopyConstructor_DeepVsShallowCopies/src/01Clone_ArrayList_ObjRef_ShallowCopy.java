import java.util.*;

class Age {
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
  public String toString() { 
    return "["+age+"]"; 
  }
}

class CloneTest {
	public static void main(String[] args) {
		ArrayList<Age> ageList;
		ageList = new ArrayList<Age>( Arrays.asList( new Age(1), new Age(2), new Age(3) ) );
		System.out.println("ageList \t" + ageList);						// print ageList
		
		ArrayList<Age> ageListClone = (ArrayList<Age>)ageList.clone();	// clone ageList
		System.out.println("ageListClone \t" + ageListClone);			// print ageListClone
		
		System.out.println("\nageListClone.get(2).zeroAge()\n");
		ageListClone.get(2).zeroAge();							//zero the last Age of the clone
		
		System.out.println("ageList \t" 	+ ageList);			//print ageList, and
		System.out.println("ageListClone \t" + ageListClone);	//print ageListClone
		System.out.println("...both get changed?");				// why did both get changed?
	}
  
}