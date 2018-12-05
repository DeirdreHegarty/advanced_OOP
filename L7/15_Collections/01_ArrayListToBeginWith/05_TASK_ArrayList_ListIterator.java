// /**
//  *TASK:
//  *	Create a test program to demo java.util.ArrayList to yourself. 
//  * 		You need only use ArrayList<String>.
//  *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
//  *				https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
//  *				http://beginnersbook.com/2014/06/difference-between-iterator-and-listiterator-in-java/
//  *	
//  * 1) In the program - demonstrate how to use an ListIterator over the list:
//  *		a) previous()	
//  *		b) nextIndex()		
//  *		c) previousIndex()
//  *		d) set()	
//  *		e) add() 
//  *	
//  *		Q1 Suppose you have an ArrayList<String> with the elements:
//  *				[pear, apple, orange]
//  *			Briefly explain what you could do with a ListIterator, that you 
//  * 			could NOT do with an Iterator over that ArrayList<String> 
//  */
import java.util.*;

class Runner{
	public static void main(String [] args){

// 1) 

		ArrayList<String> moreFruit = new ArrayList<String>();
		moreFruit.add("pear");
		moreFruit.add("apple");
		moreFruit.add("orange");
		ListIterator<String> li = moreFruit.listIterator();
		System.out.println(moreFruit); 		// [pear, apple, orange]

		System.out.println(li.next()); 		// pear
// a)
		System.out.println(li.previous()); 	// pear
// b)
		System.out.println(li.nextIndex()); // 0

		while(li.hasNext()){
			li.next();
// c)
			System.out.println(li.previousIndex()); 
		}
// d)
		li.set("None");
		System.out.println(moreFruit);  // [pear, apple, None]
// e)
		li.add("invalid fruit");
		System.out.println(moreFruit); 	// [pear, apple, None, invalid fruit]

// ***********************************************************

// Q1 			ListIterator VS Iterator 
// https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
// https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html

// Iterator only has three methods - hasNext(), next() and remove(), whereas 
// ListIterator has nine methods - the above plus, hasPrevious(), previous(), previousIndex(),
//									nextIndex(), set() and add() 
// 

		Iterator<String> i = moreFruit.iterator();
		System.out.println(i.hasNext());
		// iterate through list
		while(i.hasNext()){
			System.out.println(i.next());
		}

		// WITH LISTITERATOR CAN ITERATE THROUGH LIST BACKWARDS AND RETURN THE INDEX
		// iterate through list
		ListIterator<String> i2 = moreFruit.listIterator();
		while(i2.hasNext()){
			System.out.println(i2.nextIndex());
			System.out.println(i2.next());
		}
		// iterate through list backwards
		while(i2.hasPrevious()){
			System.out.println(i2.previousIndex());
			System.out.println(i2.previous());
		}

		// ListIterator can set an element
		i2.set("one"); 						// sets returned from previous() or next() methods
		System.out.println(moreFruit);

		// ListIterator can add to a list
		i2.add("new number one");
		System.out.println(moreFruit); 		// [new number one, one, apple, None, invalid fruit]

	}
}