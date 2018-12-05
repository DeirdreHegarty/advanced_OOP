// /**
//  *TASK:
//  *	We're going to use the following two utilities in to create quick collections
//  *	of Strings for the tasks in this folder.
//  *	- Arrays.asList() //java.util.Arrays is a utility class with handy methods for collections/array processing
//  *	- String.split(delimeter:String) //java.lang.String - method to create an array from a String of values
//  *
//  *	1. String.split() - try the following, and see that in each case you get back an array of String
//  *
//  *		String[] s = "each word in this string is seperated by a space".split(" ");	
//  *		for(String word: s){System.out.println(word);}
//  *		s.getClass(); //the getClass() method of java.lang.Object returns the class (/type) of object
//  *	
//  *	2. See the Java documentation here: 
//  *		http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList%28T...%29
//  *		for Arrays.asList() 
//  *		//note: you can pass it a set of comma-seperated values, or an array of values: e.g.
//  *		//a) for String objects
//  *				List<String> l1 = Arrays.asList("this", "that", "these", "those"); //see returns a List<T>
//  *				List<String> l2 = Arrays.asList( new String[]{"father", "mother", "brother", "other"} );
//  *
//  *	//You may find the String.split() slightly easier to use: i.e.
//  *				List<String> l3 = Arrays.asList( "how now brown cow".split(" ") ); //the String.split() creates an array argument
//  * 
//  *	3. See Collections.addAll() here:
//  *		Collections.addAll( l1, "I", "owe", "you")
//  */

import java.util.*; 

class Runner{
	public static void main(String [] args){

// 1.
		String[] s = "each word in this string is seperated by a space".split(" ");	
	 	for(String word: s){
	 		System.out.println(word);
	 	}
	 	System.out.println(s.getClass()); //the getClass() method of java.lang.Object returns the class (/type) of object

// 2.
	 	List<String> l1 = Arrays.asList("this", "that", "these", "those"); //see returns a List<T>
		List<String> l2 = Arrays.asList( new String[]{"father", "mother", "brother", "other"} );

		System.out.println(l1); // returns [this, that, these, those]
		System.out.println(l2); // returns [father, mother, brother, other]

		printList(l1);
		printList(l2);

		List<String> l3 = Arrays.asList( "how now brown cow".split(" ") ); //the String.split() creates an array argument
		System.out.println(l3); //returns [how, now, brown, cow]
// 3.
		// boolean b = Collections.addAll( l1, "I", "owe", "you");
	}

	// print each element in a list
	public static void printList (List<String> aList) {
	    for(String currentString : aList){
	        System.out.println(currentString);
	    }
	}
}