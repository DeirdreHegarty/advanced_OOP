// https://stackoverflow.com/questions/252055/java-generics-wildcards
// https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html
// https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
// https://stackoverflow.com/questions/3486689/java-bounded-wildcards-or-bounded-type-parameter

import java.util.*;
class Num{
	int a;

	Num(int aVal){ a = aVal; }

	int value(){ return a; }

	public String toString(){return Integer.toString(a);}			
}

class SmallNum extends Num{			    

  SmallNum(int aVal){
  	super(aVal);
  }
}

class VerySmallNum extends SmallNum{ 
  VerySmallNum(int aVal){
    super(aVal);
  }
}

class invalidNum{}							//Not a subclass

class Box<T extends Num> {
    private T t;					
    
    public void set(T t) { 
    	this.t = t; 
    }

    public T get() { 
    	return t; 
    }

}

// bounded places a restriction on type passed
class BoundedBox1 { 					
    
    public <T extends SmallNum> void testing1(T t){ 			// generic method - lower bound
    	System.out.println("testing1");
    }
    public void testing2(List <? extends SmallNum> tList){ 		// wildcard - lower bound
    	System.out.println("testing2");
    }
    
}

// wildcar can only be used on collections, whereas type parameter can be used for all types

class Runner{
    public static void main(String[] args) {
    	Box<Num> n = new Box<>();
	    n.set( new Num(4) );
		System.out.println(n.get());

        Box<Num> sn = new Box<>();
	    sn.set( new SmallNum(4) );
		System.out.println(sn.get());

		BoundedBox1 box = new BoundedBox1(); 
		box.testing1(new SmallNum(4));
		box.testing1(new VerySmallNum(4));
		// box.testing1(new Num(4)); 				// throws an error 

		List<SmallNum> testLowerList = new ArrayList<SmallNum>();
		testLowerList.add(new SmallNum(4));
		testLowerList.add(new VerySmallNum(4));
		box.testing2(testLowerList);

		// box.testing2(Arrays.asList( new Num(4) )); // inference variable T has incompatible bounds
    }
}

// http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeArguments.html#FAQ203
// A wildcard can have only one bound, either a lower or an upper bound.
// A list of wildcard bounds is not permitted.
// The wildcard bound describes the family of types that the wildcard stands for.
// 
// The type parameter bounds give access to their non-static methods.
// A type parameter, in constrast, can have several bounds, but there is no such 
// thing as a lower bound for a type parameter. 
// 	
