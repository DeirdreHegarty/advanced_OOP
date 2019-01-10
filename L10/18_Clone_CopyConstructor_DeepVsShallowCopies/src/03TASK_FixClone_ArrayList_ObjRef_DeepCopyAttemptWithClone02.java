/** TASK: The following code builds on the previous example.
 *	Age.clone() is implemented as before, but now a wrapper-class
 *	'class AgeList{...}', is used to wrap the ArrayList<Age> (by composition).
 *	However, despite the 'class AgeList' implementing Cloneable, 
 *	 and overriding clone(), it is not working as it should.
 *	Analyse the code and fix the problem: see '//TASK' comment below
 *
 *	Write a brief comment to explain what has happened (why the clone() operation)
 *		doesn't work as would be intended. State how you fixed it, and what your
 *		fix achieves (why it works).
 *	<TASK ANSWER HERE>
 */
import java.util.*;
class Age implements Cloneable{
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age = 0; }
  public Age clone() throws CloneNotSupportedException{		
	Age clone = (Age)super.clone();								
	return clone;
  }
  /*
  public String toString() { 					
    return "["+age+"]"; 
  }//*/
}

class AgeList implements Cloneable{				
	ArrayList<Age> ages;	
	AgeList(){
		ages = new ArrayList<Age>( Arrays.asList( new Age(1), new Age(2), new Age(3) ) );
	}
	//TASK: There is a bug in this clone() method: analyse & fix-it
	// 			some debugging code-statements have been added already to help.
	public AgeList clone() throws CloneNotSupportedException{	
		AgeList clonedAgeList = (AgeList)super.clone();
		System.out.println( clonedAgeList+ " : clonedAgeList (from super.clone())" );
		System.out.print("\t");
		for( int i = 0; i < ages.size(); i++ ){
			Age clonedAge = ages.get(i).clone();
			System.out.print(clonedAge+",");					//print each cloned element 
			clonedAgeList.ages.set(i,  clonedAge);				//replace clonedAgeList.ages, with clone
		}
		System.out.println();
		System.out.println( clonedAgeList +" : clonedAgeList after resetting clones:" +" ??Bug here??");
		System.out.println(Integer.toHexString(System.identityHashCode(this.ages))+":"+ this.ages + " : ages after ??changing clonedAgeList, changed ages??");
		return clonedAgeList;
	}
	public String toString(){
		return Integer.toHexString(System.identityHashCode(this))+":"+ages.toString();
	}
}
class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		AgeList ageList = new AgeList();
		System.out.println(ageList + " ageList");					
		System.out.println("calling ageList.clone()");
		AgeList ageListClone = ageList.clone();	
		System.out.println(ageList + " ageList");					
		System.out.println(ageListClone + " ageListClone");					
		
		System.out.println("\nAltering ageListClone.ages.get(2) only!"+	
								" setting age to zero");
		
		ageListClone.ages.get(2).zeroAge();							
		System.out.println(ageListClone + " ageListClone");					
		System.out.println("...both get changed?");
	}
  
}
/*
		
*/