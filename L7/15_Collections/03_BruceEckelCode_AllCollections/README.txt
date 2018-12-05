// Recommended for study:
//	Eckel, B., 2006. Thinking in Java, 4 edition. ed. Prentice Hall, Upper Saddle River, NJ.
//	Chapters:"Holding your objects", "Generics" & "Containers in Depth"
//     codes below from this book, freely available once linking
//		the copyright from the auther - see text for instrucitons
//	Full Code for Bruce Eckel Thinking In Java (4e) here:
//	http://www.mindviewinc.com/TIJ4/CodeInstructions.html

//Practical Task:
//Go to .\src\holding\ListFeatures.java  and compile with -cp to ..\..\bin
//i.e. Compile & run as follows:
 javac -d ..\..\bin ..\net\mindview\util\Print.java
 javac -d ..\..\bin -cp ..\..\bin ..\typeinfo\pets\*.java
 javac -d ..\..\bin -cp ..\..\bin ListFeatures.java
 java -cp ..\..\bin ListFeatures

 //Also, see the example showing how core containers (in Java) and 
 //	how the different types of container fill their contents
 // (i.e. the order they fill in their contents) .\src\holding\PrintingContainers.java
 javac -cp ..\..\bin -d ..\..\bin PrintingContainers.java
 java -cp ..\..\bin PrintingContainers
 
 //Also, see the example showing how core containers (in Java) add elements
 // - see the issue with trying to add(...) to a list created by Arrays.asList();
 // See: .\src\holding\AddingGroups.java
 
//Also, see the example of using Iterator<T> as the declared parameter of a method
//	to create a truly polymorphic method in .\src\holding\CrossContainerIteration.java
 javac -d ..\..\bin -cp ..\..\bin CrossContainerIteration.java
 java -cp ..\..\bin CrossContainerIteration


// For LinkedList/Stack/Queue implementation possibilities: see
// .\src\holding\LinkedListFeatures.java & 
// .\src\holding\StackTest.java ---> net.mindeview.util.Stack.java 

// For Sets - see .\src\holding\SetOfInteger.java & .\src\holding\SortedSetOfInteger.java 
 
 // **Overview of Containers**
 // Containers can be split into:
 //		* Collection
 //			- List (ArrayList (/Vector), LinkedList
 //			- Set	- HashSet, TreeSet, LinkedHashSet
 //			- Queue - PriorityQueue 
 //		* Map
 //			-	HashMap, TreeMap, LinkedHashMap
 //
 // The two utility classes java.util.Collections and java.util.Arrays
 //		provide methods for searching/sorting/addingGroupsTo etc.
 //
 // (See. "BruceEckel_CollectionsTaxonomyDiagram_TIJ4_pg309")
 // (See: https://www.assembla.com/spaces/almejoLisp/documents/aP0zueLu8r37NZeJe5cbLA/download/java-collections.jpg )
 //	(See. SCJP Book: Chapter 7: Generics and Collections & Figure 7-2 within)
 


