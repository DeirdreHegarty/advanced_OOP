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

class AgeList implements Cloneable{						//Object
	private ArrayList<Age> ages;						// Composed of an ArrayList<Age>
	AgeList(){
		ages = new ArrayList<Age>( Arrays.asList( new Age(1), new Age(2), new Age(3)) );
	}
	
	public String toString(){
		return ages.toString();
	}
}
class SeniorAgeList extends AgeList implements Cloneable{
	public SeniorAgeList clone() throws CloneNotSupportedException{
		SeniorAgeList clonedAgeList = (SeniorAgeList)super.clone();
		clonedAgeList.ages = (ArrayList<Age>)ages.clone();	//UUURRGH!...private in base-class
		for(int i =0; i < ages.size(); i++){
			clonedAgeList.ages.set( i, ((Age)ages.get(i)).clone() ); 
		}
		return cloneAgeList;
	}
}
class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
	
	}
  
}