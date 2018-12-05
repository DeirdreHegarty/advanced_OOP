// /**
//  *TASK:
//  *	Create a test program to demo java.util.ArrayList to yourself. 
//  * 		You need only use ArrayList<String>.
//  *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
//  *	
//  * 1) In the program - demonstrate the following:
//  *		a) set()
//  *		b) subList()
//  *		c) addAll()		//briefly comment what this does
//  *		d) retainAll()	//briefly comment what this does
//  *		e) toArray()
//  *		f) toArray(T[])
//  *
//  * 2) Answer the following questions:
//  * 		Q2a) What does set(:int, :Element) return? What other obvious name 
// 				could have been used to describe it's function?
//  *			
//  *		Q2b) Suppose you have an ArrayList<String> with elements: 
//  *				[ pear, apple, orange, kiwi].
//  *				Suppose you then do a 'List l = subList(0,2);' operation. If you 
//  *				then do an 'l.set(0,"kiwi");' operation, what does 'l' contain, 
//  *				& what does the original ArrayList<String> contain?
//  *				(Look-up the term "backed-list" w.r.t Java Collections and briefly explain it).
//  *
//  *		Q2d) How does Collections.sort() compare to Arrays.sort()?
//  *			Resource: http://stackoverflow.com/questions/5208133/collections-vs-arrays-regarding-sort
//  *
//  */
import java.util.*; 

class Runner{
	public static void main(String [] args){
// ***********************************************************
// 1)
		List<String> colours = new ArrayList<>();		
		colours.add("red");
		colours.add("yellow");
		colours.add("pink");
		colours.add("green");
		colours.add("orange");
		System.out.println(colours); 				// [red, yellow, pink, green, orange]
// a)
		System.out.println(colours.set(0,"crimson")); // red
		colours.set(0,"crimson");
		System.out.println(colours); 				// [crimson, yellow, pink, green, orange]
// b)
		List subColours = colours.subList(1,3);
		System.out.println(subColours); 			// [yellow, pink]
// c)
		// Appends all of the elements in the specified collection to the end of this list, 
		// in the order that they are returned by the specified collection's Iterator. 
		// 
		// [ https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#addAll(java.util.Collection) ]

		List<String> moreColours = new ArrayList<>();
		System.out.println(moreColours);			// []

		moreColours.addAll(colours);
		System.out.println(moreColours);			// [crimson, yellow, pink, green, orange]
// d)
		// Retains only the elements in this list that are contained in the specified collection. 
		// In other words, removes from this list all of its elements that are not contained in 
		// the specified collection.
		// 
		// [ https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#retainAll(java.util.Collection) ]
		// It gets the intersection for two lists

		List<String> intersectColours = new ArrayList<>();
	
	    intersectColours.add("green"); 
		intersectColours.add("red"); 
		intersectColours.add("white");
		System.out.println(intersectColours); // [green, red, white]

		intersectColours.retainAll(moreColours);
		System.out.println(intersectColours); // [green]
// e)
		System.out.println(moreColours);			 // [crimson, yellow, pink, green, orange]
		System.out.println(moreColours.toArray());	 // [Ljava.lang.Object;@7a46a697	
		
		// https://www.tutorialspoint.com/java/util/arraylist_toarray_object.htm
		// NEEDS TO BE OBJECT ARRAY
		Object [] arr = moreColours.toArray();
		for (Object x : arr) {
         System.out.print(x+" "); 					// crimson yellow pink green orange 
	     }

// f)
	    String list2[] = new String[moreColours.size()];
	    list2 = moreColours.toArray(list2); 
		for (Object x : list2) {
	         System.out.print(x+" "); 					// crimson yellow pink green orange 
	     }
// ***********************************************************
// 2)
// Q2a)
		// set(:int, :Element) returns the element previously at the specified position	   
		// in 1 a) `colours.set(0,"crimson");` returns `red`
	    // Another name for this method could have been `replace()`
// Q2b)
	    // https://turreta.com/2016/11/20/array-backed-lists-in-java/
	    // BACKED-LIST : Happen when you convert an array to a list
	    // using `Arrays.asList()`. Array-backed list are fixed-length. 
	    // Meaning you cannot change the list by adding or removing elements.

	    List<String> fruit = new ArrayList<>();
	    fruit.add("pear");
	    fruit.add("apple");
	    fruit.add("orange");
	    fruit.add("kiwi");
	    System.out.println(fruit); 	// [pear, apple, orange, kiwi]

	    List l = fruit.subList(0,2);
	    System.out.println(l); 		// [pear, apple]

		// BELOW CAUSES AN ERROR 
	    // `Note: 02_TASK_ArrayList_MoreMethods.java uses unchecked or unsafe operations.`
	    l.set(0,"kiwi");
		System.out.println(l);
// Q2d)
		// [ http://stackoverflow.com/questions/5208133/collections-vs-arrays-regarding-sort ]
		// Collections.sort() Operates on a List. Whereas Arrays.sort() Operates on an Array.
		//
		// Collections.sort() can be used when dealing with something that implements 
		// the Collection interface (eg ArrayList)

	}
}



