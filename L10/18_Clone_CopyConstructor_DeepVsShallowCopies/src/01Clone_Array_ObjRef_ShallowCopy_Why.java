import java.util.*;

class Age {
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
  /*public String toString() { 					//removing toString() 
    return "["+age+"]"; 
  }*/
}

class CloneTest {
	public static void main(String[] args) {
		Age[] ageArray = new Age[]{new Age(1), new Age(2), new Age(3)};
		print("ageArray \t", ageArray);							
		
		Age[] ageArrayClone = ageArray.clone();				//clone(), clones the array	
		print("ageArrayClone \t", ageArrayClone);			// which in Java, is an array of	
															// object references.
		System.out.println("\nageArrayClone[2].zeroAge();\n");	//I.e. references to the same Age 
		ageArrayClone[2].zeroAge();								// obj's in the original
		
		print("ageArray \t" 	  , ageArray);				
		print("ageArrayClone \t" , ageArrayClone);			
		System.out.println("...both get changed?");			
	}
 
  static void print(String msg, Age[] ageArray){
	System.out.println(msg+ Arrays.toString(ageArray));
  }
 
} 