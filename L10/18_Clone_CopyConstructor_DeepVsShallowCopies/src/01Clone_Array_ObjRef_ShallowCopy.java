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
		Age[] ageArray = new Age[]{new Age(1), new Age(2), new Age(3)};
		print("ageArray \t", ageArray);							// print ageArray
		
		Age[] ageArrayClone = ageArray.clone();					// clone ageArray
		print("ageArrayClone \t", ageArrayClone);				// print ageArrayClone
		
		System.out.println("\nageArrayClone[2].zeroAge();\n");
		ageArrayClone[2].zeroAge();							//zero the last Age of the clone
		
		print("ageArray \t" 	  , ageArray);				//print ageArray
		print("ageArrayClone \t" , ageArrayClone);			//print ageArrayClone
		System.out.println("...both get changed?");			// why did both get changed?
	}
 
  static void print(String msg, Age[] ageArray){
	System.out.println(msg+ Arrays.toString(ageArray));
  }
 
} 