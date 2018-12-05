// https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
// https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
// https://www.geeksforgeeks.org/hashset-vs-treeset-in-java/
import java.util.*;

class The_Tree_Comparator implements Comparator<String> { 
    public int compare(String str1, String str2) 
    { 
        String first_Str; 
        String second_Str; 
        first_Str = str1; 
        second_Str = str2; 
        return second_Str.compareTo(first_Str); 
    } 
} 

class MySetExample{ 
	public static void main (String [] args){

// *************** TREESET HAS 25 METHODS ****************************************************		   
// https://www.geeksforgeeks.org/treeset-in-java-with-examples/
		TreeSet<String> t = new TreeSet<String>(); 
		System.out.println("*************** TREESET **********************");
  
		// Elements are added using add() method 
		t.add("One"); 
		t.add("Two"); 
		t.add("Three"); 
		t.add("Four"); 
		t.add("Five"); 
  
		// Elements get stored in default natural 
		// Sorting Order(Ascending) 
		System.out.println(t); 
// Iterator
		Iterator<String> i = t.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}

// DescendingIterator
		Iterator<String> d = t.descendingIterator();
		while(d.hasNext()){
			System.out.println(d.next());
		}
// descendingSet, resource - https://www.geeksforgeeks.org/treeset-descendingset-method-in-java-with-examples/

		// getting the reverse order view of element 
		// using descendingSet() method 
		NavigableSet<String> treereverse = t.descendingSet(); 
		System.out.println(treereverse); 			// [Two, Three, One, Four, Five]
// size
		System.out.println(t.size());  				// 5
// isEmpty
		System.out.println(t.isEmpty()); 			// false
// contains
		System.out.println(t.contains("One")); 		// true
		System.out.println(t.contains("null")); 	// flase
// add
		t.add("Six");
		System.out.println(t); 						// [Five, Four, One, Three, Two, Six] (no longer sorted)
// remove
		System.out.println(t.remove("Six")); 		// true
		System.out.println(t.remove("Six"));		// false
// clear
		t.clear();
		System.out.println(t); 						// []
// addAll
		TreeSet<String> t1 = new TreeSet<String>(); 
		t1.add("One"); 
		t1.add("Two"); 
		t1.add("Three"); 
		t1.add("Four"); 
		t1.add("Five");
		t.addAll(t1);
		System.out.println(t); 						// [Five, Four, One, Three, Two]
// subSet
		TreeSet<String> sub_set1 = (TreeSet<String>)t1.subSet("Four","Three"); 
		System.out.println(sub_set1);				// [Four, One]

		TreeSet<String> sub_set2 = (TreeSet<String>)t1.subSet("Four",true,"Three",true); 
		System.out.println(sub_set2);				// [Four, One, Three]
// headSet
		TreeSet<String> head_set1 = (TreeSet<String>)t1.headSet("One"); 
		System.out.println(head_set1); 				// [Five, Four]

		TreeSet<String> head_set2 = (TreeSet<String>)t1.headSet("One", true); 
		System.out.println(head_set2); 				// [Five, Four, One]
// tailSet
		TreeSet<String> tail_set1 = (TreeSet<String>)t1.tailSet("One"); 
		System.out.println(tail_set1); 				// [One, Three, Two]

		TreeSet<String> tail_set2 = (TreeSet<String>)t1.tailSet("One", false); 
		System.out.println(tail_set2); 				// [Three, Two]
// comparator - https://www.geeksforgeeks.org/treeset-comparator-method-in-java/
		// Creating a comparator
		Comparator comp = t1.comparator();
		System.out.println(comp); 					// null (it follows natural ordering)

		TreeSet<String> tree_set = new TreeSet<String>(new The_Tree_Comparator());  // DEFINED ABOVE
   
        tree_set.add("A"); 
        tree_set.add("B"); 
        tree_set.add("C"); 
        tree_set.add("D"); 
        tree_set.add("E"); 
        System.out.println("Set before using the comparator: "+ tree_set);  // [E, D, C, B, A]
   
        System.out.println("The elements sorted in descending order:"); 
        for (String element : tree_set) 
            System.out.print(element + " "); 
        System.out.println();

        // prints:
        // The elements sorted in descending order:
		// E D C B A 

// first
		System.out.println(t1.first()); 			// Five
// last
		System.out.println(t1.last()); 				// Two

// lower
		System.out.println("Lower : "+t1.lower("One")); 	// Lower : Four
// floor - https://www.tutorialspoint.com/java/util/treeset_floor.htm
		// creating a TreeSet 
		TreeSet <Integer>treeadd = new TreeSet<Integer>();

		// adding in the tree set
		treeadd.add(12);
		treeadd.add(11);
		treeadd.add(16);
		treeadd.add(15);

		System.out.println(treeadd);  							// [11, 12, 15, 16]

		// gets the closest value to arg (lower)
		System.out.println("Floor : "+treeadd.floor(20)); 		// Floor : 16
// ceiling
		// gets the closest value to arg (higher)
		System.out.println("Ceiling : "+treeadd.ceiling(20)); 	// null
		System.out.println("Ceiling : "+treeadd.ceiling(10)); 	// 11
// higher
		System.out.println("Higher : "+treeadd.higher(11)); 	// 12

// pollFirst - https://www.tutorialspoint.com/java/util/treeset_pollfirst.htm
		// remove the first element
		System.out.println("pollFirst : "+treeadd.pollFirst()); // pollFirst : 11
		System.out.println(treeadd); 							// [12, 15, 16]
// pollLast
		// remove the last element
		System.out.println("pollFirst : "+treeadd.pollLast()); 	// pollFirst : 16
		System.out.println(treeadd); 							// [12, 15]
// clone
		TreeSet clonedSet = (TreeSet)treeadd.clone();
		System.out.println("clonedSet : "+clonedSet); 			// clonesSet : [12, 15]


// *************** HASHSET ****************************************************	
		System.out.println("*************** HASHSET **********************");
		// https://www.geeksforgeeks.org/hashset-in-java/
		HashSet<String> h = new HashSet<String>();
		h.add("One");    
		h.add("Two");    
		h.add("Three");   
		h.add("Four");  
		h.add("Five");  
		System.out.println(h); // unordered

		HashSet<String> h2 = new HashSet<String>();
		h2.add("One");    
		h2.add("Two");    
		h2.add("Three");   
		h2.add("Four");  
		h2.add("Five");  
		System.out.println(h2); // unordered

		// null object
		HashSet<String> hNull = new HashSet<String>();
		hNull.add(null);
		System.out.println(hNull);							// [null]

		TreeSet<String> treeNull = new TreeSet<String>();
		treeNull.add(null);    								//  java.lang.NullPointerException
		System.out.println(treeNull);

		// compare() two HashSets
		System.out.println(h.equals(h2)); // true
		h2.add("Six");
		System.out.println(h.equals(h2)); // false



// ************** TREESET VS HASHSET ****************
// https://www.geeksforgeeks.org/hashset-vs-treeset-in-java/
// 
// * HashSet has 8 methods. TreeSet has 25 methods.
// 
// * Elements in HashSet are not ordered. TreeSet elements are in ascending order by default.
// 
// * HashSet allows null object. TreeSet will throw a NullPointerException.
//
// * HashSet uses equals() method to compare two object in Set and for detecting duplicates. 
// TreeSet uses compareTo() method for same purpose.
// If equals() and compareTo() are not consistent, i.e. for two equal object equals should return true 
// while compareTo() should return zero, than 
// it will break contract of Set interface and will allow duplicates in Set implementations like TreeSet
	}
}


   
