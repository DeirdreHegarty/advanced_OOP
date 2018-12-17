// https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html

// An "In" Variable: 
// * serves data to the code. 
// * Example : copy method with two arguments: copy(src, dest) -  src is the "in" variable
// * keyword extends e.g. <? extends Num>


// An "Out" Variable:
// * holds data for use elsewhere. 
// * i.e. the dest variable from above example
// * keyword super e.g. <? super SmallNum>

// * Unbounded wildcards should be used if "in" variable inside an object class
// * Don't use wildcards if both "in" & "out" variables need to be accessed by code
// * Above guidelines don't apply to methods return type (should avoid using wildcard as return type)
// * Using wildcards for return type can cause errors - example below

import java.util.*;
class NaturalNumber {
    private int i;
    public NaturalNumber(int i) { this.i = i; }
}

class EvenNumber extends NaturalNumber {
    public EvenNumber(int i) { super(i); }
}

class Runner{
    public static void main(String[] args) {

    	List<EvenNumber> le = new ArrayList<>();
		List<? extends NaturalNumber> ln = le;
		// ln.add(new NaturalNumber(35));  			// compile-time error

		// ln cannot store new element or change existing element
    }
}