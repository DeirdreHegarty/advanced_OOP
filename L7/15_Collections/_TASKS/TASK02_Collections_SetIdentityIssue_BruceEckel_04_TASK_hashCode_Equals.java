// /**
//  *	TASK INTRO': 
//  *    With the current implementation of BruceEckel's 
//  *    'typeinfo.pets.Individual' (Pet, Dog) classes, the 
//  *    code below does not prevent two Dogs with the same name
//  *    from being added to a Set (i.e. execute the code & see).
//  *	TASK 01:
//  *		Are the two new Dog instances at the commented lines 
//  *			"//DOG Instance" of the code below - hashing to the 
//  *			same hash location?
//  *  TASK 02:
//  *      Submit a new implementation of 
//  *			'typeinfo.pets.Individual.hashCode()' 
//  *			...and (only if necessary)
//  *			'typeinfo.pets.Individual.equals()'
//  *		such that the code below would result in only _one_
//  * 		instance of Pet being added to the HashSet<Pet>.
//  *		(That is, make Pets (/Individuals) unique based on their
//  *			name attribute and make any necessary consequent changes) 
//  *
//  *	TASK 03: 
//  *		Explain using the 'typeinfo.pets.Individual' class as an example, 
//  *		how the 'equals()' satisfies the standard 'equals()' contract, & 
//  *		how the 'hashCode()' satisfies the standard 'hashCode()' contract 
//  *		
//  */
import typeinfo.pets.*;
import java.util.*;		//Set, HashSet
class TestPetSet
{
	public static void main(String[] args){
		Set<Pet> pets = new HashSet<Pet>();
		pets.add( new Dog("jeff") );				//DOG Instance
		pets.add( new Dog("jeff") );				//DOG Instance
		
		System.out.println( pets );
	}
}