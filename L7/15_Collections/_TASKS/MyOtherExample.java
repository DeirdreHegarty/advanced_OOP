//  https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
//  https://www.tutorialspoint.com/java/java_linkedlist_class.htm
import java.util.*;
class MyOtherExample{ 
	public static void main (String [] args){
		System.out.println("************ LINKEDLIST ***********");
		LinkedList<String> linky = new LinkedList<String>();
// add
		linky.add("Anne");
		linky.add("Barry");
		linky.add("Clara");
		linky.add("Dee");
		linky.add("Franky");
		linky.add("Eilis");
		System.out.println(linky); 					// [Anne, Barry, Clara, Dee, Franky, Eilis]
// getFirst
		System.out.println(linky.getFirst());  		// Anne
// getLast
		System.out.println(linky.getLast());  		// Eilis
// removeFirst
		System.out.println(linky.removeFirst()); 	// Anne
		System.out.println(linky);  				// [Barry, Clara, Dee, Franky, Eilis]
// removeLast
		System.out.println(linky.removeLast()); 	// Eilis
		System.out.println(linky); 					// [Barry, Clara, Dee, Franky]
// addFirst
		linky.addFirst("Z - Anita");
		System.out.println(linky);  				// [Z - Anita, Barry, Clara, Dee, Franky]
// addLast
		linky.addLast("A - Gerry");
		System.out.println(linky);  				// [Z - Anita, Barry, Clara, Dee, Franky, A - Gerry]
// contains
		System.out.println(linky.contains(null)); 		//false
		System.out.println(linky.contains("Barry")); 	//true
// size 
		System.out.println(linky.size()); 			// 6
// remove
		linky.remove("Z - Anita");
		System.out.println(linky); 					// [Barry, Clara, Dee, Franky, A - Gerry]
// addAll
		LinkedList<String> linky2 = new LinkedList<String>();
		linky2.addAll(linky);
		System.out.println(linky2);  				// [Barry, Clara, Dee, Franky, A - Gerry]
// clear
		linky2.clear();
		System.out.println(linky2); 				//[]
// get
		String g = linky.get(2);
		System.out.println(g); 						// Dee
// set
		linky.set(1, "Colm");
		System.out.println(linky);  				// [Barry, Colm, Dee, Franky, A - Gerry]
// indexOf
		int i = linky.indexOf("Dee");
		System.out.println(i);  					// 2
// lastIndexOf
		linky.add("Dee"); 
		System.out.println(linky); 						// [Barry, Colm, Dee, Franky, A - Gerry, Dee]
		System.out.println(linky.lastIndexOf("Dee"));  	// 5
// peek
		System.out.println(linky.peek()); 				// Barry (head of list)
// element
		System.out.println(linky.element()); 			// Barry (head of list)
// poll
		System.out.println(linky); 						// [Barry, Colm, Dee, Franky, A - Gerry, Dee]
		linky.pop();
		System.out.println(linky); 						// [Colm, Dee, Franky, A - Gerry, Dee
// offer
		linky.offer("offer");
		System.out.println(linky);  					// [Colm, Dee, Franky, A - Gerry, Dee, offer]
// offerFirst
		linky.offerFirst("new head");
		System.out.println(linky); 						// [new head, Colm, Dee, Franky, A - Gerry, Dee, offer]
// offerLast
		linky.offerLast("new tail");
		System.out.println(linky); 						// [new head, Colm, Dee, Franky, A - Gerry, Dee, offer, new tail]
// peekFirst
		System.out.println("peekFirst : "+linky.peekFirst()); // peekFirst : new head
// peekLast
		System.out.println("peekLast : "+linky.peekLast()); // peekLast : new tail
// pollFirst
		System.out.println(linky); 							  // [new head, Colm, Dee, Franky, A - Gerry, Dee, offer, new tail]
		System.out.println("pollFirst : "+linky.pollFirst()); // pollFirst : new head
		System.out.println(linky); 							  // [Colm, Dee, Franky, A - Gerry, Dee, offer, new tail]
// pollLast
		System.out.println("pollLast : "+linky.pollLast());   // pollLast : new tail
		System.out.println(linky); 							  // [Colm, Dee, Franky, A - Gerry, Dee, offer]
// push
		linky.push("newer head"); 
		System.out.println(linky); 								// [newer head, Colm, Dee, Franky, A - Gerry, Dee, offer]
// pop
		linky.pop();											// REMOVE HEAD
		System.out.println(linky); 								// [Colm, Dee, Franky, A - Gerry, Dee, offer]
// removeFirstOccurrence
		linky.removeFirstOccurrence("Dee");
		System.out.println(linky);  							// [Colm, Franky, A - Gerry, Dee, offer]
// removeLastOccurrence
		linky.push("offer");
		linky.removeLastOccurrence("offer");
		System.out.println(linky);								 // [offer, Colm, Franky, A - Gerry, Dee]
// listIterator - https://www.tutorialspoint.com/java/util/linkedlist_listiterator.htm
		// CAN SET AN INDEX
		System.out.println("**** listIterator *****");
		Iterator li = linky.listIterator(2); 
		while(li.hasNext()){
			System.out.println(li.next());
		}
		// PRINTS :
		// Franky
		// A - Gerry
		// Dee
// descendingIterator
		System.out.println("**** descendingIterator *****");
		Iterator di = linky.descendingIterator(); 
		while(di.hasNext()){
			System.out.println(di.next());
		}
		// PRINTS :
		// Dee
		// A - Gerry
		// Franky
		// Colm
		// offer
// clone - https://www.geeksforgeeks.org/linkedlist-clone-method-in-java/
		LinkedList linky3 = new LinkedList();
		linky3 = (LinkedList)linky.clone();
		System.out.println(linky3); 							// [offer, Colm, Franky, A - Gerry, Dee]
// toArray
		Object [] llArray = linky3.toArray();
		System.out.println(llArray); 							// [Ljava.lang.Object;@1c53fd30
		
		for(int in = 0; in < linky3.size(); in++){
			System.out.print(llArray[in]+" "); 					// offer Colm Franky A - Gerry Dee 
		}
//
// ******************* LINKED LIST *************************************
// -- https://www.geeksforgeeks.org/linked-list-in-java/ --
//
// * elements are linked using pointers and addresses.
// 
// * each element is known as a node
// 
// * linear data structures where the elements are not stored in contiguous locations 
//
// * every element is a separate object with a data part and address part
//
// * nodes cannot be accessed directly instead we need to start from the head
// and follow through the link to reach to a node we wish to access.

//
// -- https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html -- 
//
// Doubly-linked list implementation of the List and Deque interfaces. Implements all 
// optional list operations, and permits all elements (including null).
// All of the operations perform as could be expected for a doubly-linked list. 
// Operations that index into the list will traverse the list from the beginning or the end, 
// whichever is closer to the specified index.
	}
}