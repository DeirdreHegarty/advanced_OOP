// /**
//  *TASK:
//  *	Create a test program to demo java.util.ArrayList to yourself. 
//  * 		You need only use ArrayList<String>.
//  *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
//  *	
//  * 1) In the program - demonstrate the following:
//  *		a) Assign an ArrayList<String> object to a  List<String> reference 
//  *		b) Use Arrays.asList() in conjunction with "String Value".split(" ")
//  *				to create an ArrayList<String> object that is assigned to a List<String>
//  *				reference
//  */

import java.util.*;

class Runner{
	public static void main(String [] args){

// 1)a)
		List<String> listToArray =  new ArrayList<String>();
		listToArray.add("item1");
		listToArray.add("item2");
		listToArray.add("item3");
		listToArray.add("item4");
		listToArray.add("item5");

		System.out.println(listToArray); // [item1, item2, item3, item4, item5]

// 1)b)
		// NOTE: split() returns a String array
		String [] testSplit = "Dave Dee Dozy Beaky Mick Tich".split(" ");

		List<String> popBand = Arrays.asList("Dave Dee Dozy Beaky Mick Tich".split(" "));
		System.out.println(popBand); // [Dave, Dee, Dozy, Beaky, Mick, Tich]

	}
}