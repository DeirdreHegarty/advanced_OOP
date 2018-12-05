// /**
//  *TASK:
//  *	Create a test program to demo java.util.ArrayList to yourself. 
//  * 		You need only use ArrayList<String>.
//  *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
//  *				https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
//  *	
//  * 1) In the program - demonstrate how to use an Iterator over the list:
//  *		a) hasNext()	//brief explain in comments
//  *		b) next()		//brief explain in comments
//  *		c) remove		//brief explain in comments
//  *	
//  *		Q1 Suppose you have an ArrayList<String> with the elements:
//  *				[pear, apple, orange]
//  *			and you have an iterator 'i' on the list...
//  *			a) Can you do a 'next()' operation without doing a 'hasNext()' before?
//  *				(Briefly outline the danger in doing this?)
//  *			b) Suppose you have done a 'next()' but you want to start again, 
//  *				 what are your options? 
//  *			c) Suppose you have a new iterator on the List above and you call next(), 
//  *					and then call remove(): what get's removed pear or apple?
//  *					(How does remove() work?)
//  *			d) If you do a 'remove()' on a new Iterator without doing a 
//  *				next() before-hand - what happens?
//  */
import java.util.*;

class Runner{
	public static void main(String [] args){
// https://stackoverflow.com/questions/3635474/how-hasnext-works-in-collection-in-java

// 1)
// a)
		// // CANNOT CREATE LIST LIKE THIS [REMOVE WONT WORK LATER]
		// Because you're using it on a List implementation returned by Arrays.asList(), 
		// which returns a fixed-length collection, therefore a remove is unsupported.

		// List<String> popBand = Arrays.asList("Dave Dee Dozy Beaky Mick Tich".split(" "));

		List<String> popBand = new ArrayList<String>();
		popBand.add("Dave");
		popBand.add("Dee");
		popBand.add("Dozy");
		popBand.add("Beaky");
		popBand.add("Mick");
		popBand.add("Tich");

		System.out.println(popBand); // [Dave, Dee, Dozy, Beaky, Mick, Tich]

		Iterator member = popBand.iterator();

		// member.hasNext() returns true until it reaches the end of the list. 
		while(member.hasNext()){
// b)
			// You have to call member.next() to advance the iterator
			// if you do not call member.next() there will be an 
			// IndexOutOfBoundsException
			String nextMemeber = (String)member.next();
			System.out.println(nextMemeber);
			// Prints:
			// Dave
			// Dee
			// Dozy
			// Beaky
			// Mick
			// Tich


// c)
// https://www.geeksforgeeks.org/remove-element-arraylist-java/

// It is not recommended to use ArrayList.remove() when iterating over elements. 
// This may lead to ConcurrentModificationException (Refer this for a sample program with this exception). 
// When iterating over elements, it is recommended to use Iterator.remove() method .

			if (nextMemeber.equals("Dozy")) {

		        // removes element  == "Dozy" using Iterator.remove()
                member.remove(); 
            }

		}

		System.out.println(popBand); // [Dave, Dee, Beaky, Mick, Tich]

// ***********************************************************
// Q1
// a) yes you can call i.next() without i.hasNext(). The danger is that a client will
// try access elements that do not exist. i.hasNext() will return true until there is nothing left
// to iterate over.

		List<String> fruit = new ArrayList<String>();
		fruit.add("pear");
		fruit.add("apple");
		fruit.add("orange");
		System.out.println(fruit); 

		Iterator i = fruit.iterator();

		// the following will throw java.util.NoSuchElementException
		// while(true){
		// 	System.out.println(i.next()); 
		// }

// b)
// https://stackoverflow.com/questions/2772836/iterator-has-next-is-there-a-way-to-get-the-previous-element-instead-of-the

// You can create a new iterator
		System.out.println(i.next());  							// pear
		Iterator i2 = fruit.iterator();
		System.out.println(i2.next());  						// pear
// or you could use a ListIterator instead of an Iterator
		ListIterator i3 = fruit.listIterator();
		System.out.println(i3.next()); 							// pear
		System.out.println(i3.previous()); 						// pear

// c) pear is removed
// https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html\
// remove() removes the element last returned by an iterator
		Iterator i4 = fruit.iterator();
		i4.next();
		i4.remove();
		System.out.println(fruit); // [pear, orange]

		
// d)
		// if 2 iterators call remove on different elements in one list a java.util.ConcurrentModificationException is thrown.
		Iterator i5 = fruit.iterator();
		// if next() is called first the iterators at at same place 
		// in the list and no exception is thrown
		// i5.next(); 
		i5.remove();
		System.out.println(fruit);

	}
}