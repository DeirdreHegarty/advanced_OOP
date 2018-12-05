// /**
//  *TASK:
//  *	Create a test program to demo java.util.ArrayList to yourself. 
//  * 		You need only use ArrayList<String>.
//  *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
//  *	
//  * 1) In the program - demonstrate the following:
//  *		a) add()
//  *		b) remove()
//  *		c) get()
//  *		d) indexOf()
//  *		e) contains()
//  *
//  * 2) Answer the following questions:
//  * 		Q2a) If you have a list with size() = 3 (i.e. indices [0][1][2] ), 
//  *				What happens if you pass the get(:int) method a value
//  *					* >2, 
//  *					* <0?
//  *		Q2b) Suppose you have an ArrayList<String> with 
//  *				elements: [ pear, apple, orange].
//  *				Suppose you then do a 'remove("pear");' operation. What happens if you 
//  *				then do a indexOf("pear") operation?
//  *
//  *		Q2c) Suppose you have an ArrayList<String> with elements:
//  *				[apple, pear, apple, orange, apple]
//  *				i)   Suppose you do an 'indexOf("apple")' operation - what do you get?
//  *				ii)  How do you get the second "apple" instance?)
//  *				iii) How do you get the last "apple" instance?)
//  *
//  */
import java.util.*; 

class Runner{
	public static void main(String [] args){
// ***********************************************************

// 1)
		List<String> colours = new ArrayList<>();
// a) 
		colours.add("red");
		colours.add("yellow");
		colours.add("pink");
 
		System.out.println(colours); 				// [red, yellow, pink]
// b)
		colours.remove("yellow");
		System.out.println(colours); 				// [red, pink]
// c)
		String getColour = colours.get(0);
	    System.out.println(getColour); 				// red
// d)
	    int indexColour = colours.indexOf("pink"); 	// 1 
	    System.out.println(indexColour);
// e) 
	    boolean containsColour1 = colours.contains("pink");
	    boolean containsColour2 = colours.contains("green");
	    System.out.println(containsColour1); 		// true
	    System.out.println(containsColour2); 		// false

// ***********************************************************

// 2)
// Q2a)
	    List<String> pets =  new ArrayList<>();
	    pets.add("dog");
	    pets.add("fish");
	    pets.add("terrapin");
	    System.out.println(pets.size());  // 3

	    String getPet1 = pets.get(2); 
	    // String getPet2 = pets.get(3);  // java.lang.ArrayIndexOutOfBoundsException
	    // String getPet3 = pets.get(-1); // java.lang.ArrayIndexOutOfBoundsException
// Q2b)
	    List<String> fruit = new ArrayList<>();
	    fruit.add("pear");
	    fruit.add("apple");
	    fruit.add("orange");

	    fruit.remove("pear");
	    System.out.println(fruit); 		// [apple, orange]

	    fruit.indexOf("pear"); 			// compiles and runs fine

	    int testFruit = fruit.indexOf("pear");
	    System.out.println(testFruit); 	// prints -1
// Q2c)
	    List<String> moreFruit = new ArrayList<>();
	    moreFruit.add("apple");
	    moreFruit.add("pear");
	    moreFruit.add("apple");
	    moreFruit.add("orange");
	    moreFruit.add("apple");

	    System.out.println(moreFruit); // [apple, pear, apple, orange, apple]
// i) 
	    int findApple = moreFruit.indexOf("apple");
	    System.out.println(findApple);  // 0 (it gets the first instance of "apple")
// ii)  REVISIT
	    int findSecondApple = moreFruit.indexOf("apple");
	    System.out.println(findSecondApple); 
// iii)
	    int findLastApple = moreFruit.lastIndexOf("apple");
	    System.out.println(findLastApple); // 4 (it gets the last instance of "apple")
	}
}