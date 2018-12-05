// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
// https://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html
// https://www.baeldung.com/java-treemap-vs-hashmap
// http://www.java67.com/2012/08/difference-between-treemap-and-treeset-java.html
import java.util.*;

class MyMapExample{ 
	public static void main (String [] args){
// *************** HASHMAP ****************************************************	
		System.out.println("********* HASHMAP ****************");	   

		HashMap<Integer, String> h  = new HashMap<>();
// put
		h.put(1,"pear");
		h.put(2,"apple");
		h.put(3,"orange");
		h.put(4,"mango");
		h.put(5,"banana");
		h.put(6,"kiwi");
		System.out.println(h); 							// {1=pear, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi}
// size
		System.out.println(h.size());					// 6
// isEmpty
		System.out.println(h.isEmpty()); 				// false
// get
		System.out.println(h.get(3)); 					// orange
		System.out.println(h.get("orange")); 			// null
// containsKey
		System.out.println(h.containsKey(3)); 			// true
		System.out.println(h.containsKey("orange")); 	// false
// putAll
		HashMap<Integer, String> h2  = new HashMap<>();
		h2.putAll(h);
		System.out.println(h2);  						// {1=pear, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi}
// remove
		System.out.println(h.remove(2));				// apple
		System.out.println(h);  						// {1=pear, 3=orange, 4=mango, 5=banana, 6=kiwi}

// clear
		h.clear();
		System.out.println(h); 							// {}
// containsValue
		System.out.println(h.containsValue("orange")); 	// false
		System.out.println(h2.containsValue("orange")); // true
// keySet - https://www.tutorialspoint.com/java/util/hashmap_keyset.htm
		Set hs = h2.keySet();
		System.out.println(hs);							// [1, 2, 3, 4, 5, 6]
// values
		Collection hv = h2.values();
		System.out.println(hv);							// [pear, apple, orange, mango, banana, kiwi]
// entrySet
		Set hes = h2.entrySet();
		System.out.println(hes); 						// [1=pear, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi]
// getOrDefault
		System.out.println(h2.getOrDefault(0, "test")); // test
		System.out.println(h2.getOrDefault(1, "test")); // pear
// putIfAbsent
		System.out.println(h2.putIfAbsent(0, "test")); 	// null
		System.out.println(h2.putIfAbsent(1, "test")); 	// doesn't change hashmap
		System.out.println(h2); 						// {0=test, 1=pear, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi}
// remove
		h2.remove(0);
		System.out.println(h2); 						// {1=pear, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi}
// replace
		h2.replace(1, "melon");
		System.out.println(h2.replace(0, "melon")); 	// null
		System.out.println(h2); 						// {1=melon, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi}
// computeIfAbsent
		h2.computeIfAbsent(7, k -> "dragon fruit");
		System.out.println(h2);							// {1=melon, 2=apple, 3=orange, 4=mango, 5=banana, 6=kiwi, 7=dragon fruit}
// computeIfPresent
		String s = h2.compute(1, (key, value) -> h2.get(key));
		System.out.println(s);							// melon
		String s1 = h2.compute(10, (key, value) -> h2.get(key));
		System.out.println(s1);							// null
// compute
		String s2 = h2.compute(1, (key, value) -> h2.get(key));
		System.out.println(s2);							// melon
// merge
		Map<Integer, String> m = new HashMap<>();
		m.merge(1,"test",String::concat);
		System.out.println(m); 							// {1=test}
// forEach - https://stackoverflow.com/questions/4234985/how-to-for-each-the-hashmap
		h2.forEach((k,v) -> System.out.println("key: "+k+" value: "+v));
		// prints:
		// key: 1 value: melon
		// key: 2 value: apple
		// key: 3 value: orange
		// key: 4 value: mango
		// key: 5 value: banana
		// key: 6 value: kiwi
		// key: 7 value: dragon fruit
// replaceAll
		h2.replaceAll((k,v) -> v = null);
		h2.forEach((k,v) -> System.out.println("key: "+k+" value: "+v));
// clone
		HashMap m2 = new HashMap();
		m2 = (HashMap)h2.clone();
		System.out.println(m2); 						// {1=null, 2=null, 3=null, 4=null, 5=null, 6=null, 7=null}
		
		// NO DUPLICATE KEYS & ONLY ONE NULL KEY
		h2.put(null,"pear");						
		System.out.println(h2);							// {null=pear, 1=null, 2=null, 3=null, 4=null, 5=null, 6=null, 7=null}
		h2.put(null,"apple");
		System.out.println(h2);							// {null=apple, 1=null, 2=null, 3=null, 4=null, 5=null, 6=null, 7=null}

// *************** TREEMAP ****************************************************	
		System.out.println("********* TREEMAP ****************");	   
		TreeMap<Integer, String> t = new TreeMap<>();
// put
	    t.put(3, "Cabbage");
	    t.put(2, "Beans");
	    t.put(1, "Aged chedar");
		System.out.println(t);	   						// {1=Aged chedar, 2=Beans, 3=Cabbage}

		t.put(1, "Aged chedar");						// NO DUPLICATE KEYS
		System.out.println(t);	   						// {1=Aged chedar, 2=Beans, 3=Cabbage}

		t.put(4, null);
		t.put(5, null);
		System.out.println(t); 							// {1=Aged chedar, 2=Beans, 3=Cabbage, 4=null, 5=null}
		// t.put(null, null);							// java.lang.NullPointerException
// size
		System.out.println(t.size());					 // 5
// containsKey
		System.out.println(t.containsKey(1)); 			//true
		System.out.println(t.containsKey(12)); 			//false
// containsValue
		System.out.println(t.containsValue("Cabbage")); //true
		System.out.println(t.containsValue("pear")); 	//false
// get
		String geti = t.get(1);
		System.out.println(geti);						// Aged chedar
// comparator
// firstKey
		System.out.println(t.firstKey()); 				// 1
// lastKey
		System.out.println(t.lastKey()); 				// 5
// putAll - https://www.geeksforgeeks.org/treemap-putall-method-in-java/
		TreeMap<Integer, String> t2 = new TreeMap<>();
		t2.putAll(t);
		System.out.println(t2); 						// {1=Aged chedar, 2=Beans, 3=Cabbage, 4=null, 5=null}
// remove
		t2.remove(4);
		System.out.println(t2); 						// {1=Aged chedar, 2=Beans, 3=Cabbage, 5=null}
// clear
		t2.clear();
		System.out.println(t2);							// {}
// clone
		System.out.println(t.clone()); 					// {1=Aged chedar, 2=Beans, 3=Cabbage, 4=null, 5=null}
// firstEntry
		System.out.println(t.firstEntry()); 			// 1=Aged chedar
// lastEntry
		System.out.println(t.lastEntry());  			// 5=null
// pollFirstEntry
		System.out.println(t); 										// {1=Aged chedar, 2=Beans, 3=Cabbage, 4=null, 5=null}
		System.out.println("pollFirstEntry : "+t.pollFirstEntry()); // pollFirstEntry : 1=Aged chedar
		System.out.println(t); 										// {2=Beans, 3=Cabbage, 4=null, 5=null}
// pollLastEntry
		System.out.println("pollLastEntry : "+t.pollLastEntry()); 	// pollLastEntry : 5=null
		System.out.println(t); 										// {2=Beans, 3=Cabbage, 4=null}
// lowerEntry
		System.out.println("lowerEntry : "+t.lowerEntry(3));  		// lowerEntry : 2=Beans
// lowerKey
		System.out.println("lowerKey : "+t.lowerKey(3));  			// lowerKey : 2
// floorEntry
		System.out.println("floorEntry: "+t.floorEntry(3)); 		// floorEntry: 3=Cabbage
// // floorKey
		System.out.println("floorKey : "+t.floorKey(3)); 			// floorKey : 3
// ceilingEntry
		System.out.println("ceilingEntry : "+t.ceilingEntry(3)); 	// ceilingEntry : 3=Cabbage
// ceilingKey
		System.out.println("ceilingKey : "+t.ceilingKey(3)); 		// ceilingKey : 3
// higherEntry
		System.out.println("higherEntry : "+t.higherEntry(3)); 		// higherEntry : 4=null
// higherKey
		System.out.println("higherKey : "+t.higherKey(3)); 			// higherKey : 4
// keySet - https://www.tutorialspoint.com/java/util/treemap_keyset.htm
		Set kset = t.keySet();
		System.out.println(t); 										// {2=Beans, 3=Cabbage, 4=null}
		System.out.println(kset); 									// [2, 3, 4]
// navigableKeySet
		Set nkset = t.navigableKeySet();
		System.out.println(nkset); 									// [2, 3, 4]
// descendingKeySet
		Set dkset = t.navigableKeySet();
		System.out.println(dkset); 									// [2, 3, 4]
// values
		System.out.println(t.values()); 							// [Beans, Cabbage, null]
// entrySet
		Set es = t.entrySet();
		System.out.println(es); 									// [2=Beans, 3=Cabbage, 4=null]
// descendingMap
		NavigableMap desmap = t.descendingMap();
		System.out.println(desmap);  								// {4=null, 3=Cabbage, 2=Beans}
// subMap
		Map sm = t.subMap(2,3);
		System.out.println(sm); 				// {2=Beans}
// headMap
		Map hm = t.headMap(4); 
		System.out.println(hm); 				// {2=Beans, 3=Cabbage}
// tailMap
		Map tm = t.tailMap(3);
		System.out.println(tm);					 // {3=Cabbage, 4=null}


// ************** HASHMAP VS TREEMAP *****************************************
// https://www.baeldung.com/java-treemap-vs-hashmap

// HashMap extends the AbstractMap class and implements the Map interface. 
// TreeMap extends AbstractMap class and implements NavigableMap interface

// HashMap doesn't hold an particular order
// TreeMap is sorted according to their natural order

// HashMap allows storing at most one null key and many null values.
// TreeMap doesn’t allow a null key but may contain many null values.

// HashMap, being a hashtable-based implementation, internally uses an array-based 
// data structure to organize its elements according to the hash function.
// TreeMap stores its data in a hierarchical tree with the ability to sort the 
// elements with the help of a custom Comparator.

// Both don't support duplicate keys

// Both aren't synchronized, and need to be synchronized externally whenever multiple threads access them

	}
}