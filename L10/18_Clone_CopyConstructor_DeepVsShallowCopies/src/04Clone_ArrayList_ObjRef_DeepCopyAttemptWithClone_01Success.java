import java.util.*;

class Age implements Cloneable{
  private int age;
  public Age(int anAge) { age = anAge; }
  public void zeroAge() { age=0; }
  public Age clone() throws CloneNotSupportedException{			
	Age clone = (Age)super.clone();
	return clone;
  }
  public String toString() { 									 
    return "["+age+"]"; 										
  }																
}

class AgeList implements Cloneable{				//Object
	ArrayList<Age> ages;						// Composed of an ArrayList<Age>
	AgeList(){
		ages = new ArrayList<Age>( Arrays.asList( new Age(1), new Age(2), new Age(3)) );
	}
	public AgeList clone() throws CloneNotSupportedException{
		AgeList clonedAgeList = (AgeList)super.clone();
		clonedAgeList.ages = (ArrayList<Age>)ages.clone();
		for(int i =0; i < ages.size(); i++){
			clonedAgeList.ages.set( i, ((Age)ages.get(i)).clone() ); 
		}
		return clonedAgeList;
	}
	public String toString(){
		return ages.toString();
	}
}
class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		AgeList ageList = new AgeList();
		System.out.println(ageList+" : ageList" );					
		
		AgeList ageListClone = ageList.clone();	
		System.out.println(ageListClone+" : ageListClone" );					
		
		System.out.println("\nAltering ageListClone.ages.get(2) only!"+	
								" setting age to zero");
		
		ageListClone.ages.get(2).zeroAge();							
		System.out.println(ageList+" : ageList" );					
		System.out.println(ageListClone+" : ageListClone" );					
		System.out.println("...ageListClone is now a deep-copy?");
	}
  
}
/*
		for( int i = 0; i < ages.size(); i++ ){
			Age ageClone = ages.get(i).clone();
			System.out.print(ageClone+",");
			clone.ages.set(i,  ageClone);					//clone each element of ArrayList
		}
*/