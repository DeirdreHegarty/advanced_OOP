/**
 * TASK: 1) the method mutateDeep() is attempting a deep-copy below, but is not working.
 *				Explain why it's not working and make the code-change to fix it.
 *       2) Suppose you had a class
 *				class Parent{
 *					Gene[] genes;
 *					...
 *				}
 *			Further, suppose offspring are combined by copying elements of two parent
 *				Gene[]'s like so:
 *				parent1.genes 	[[abcd][dcba]]	@111[ [@222] [@333] ]
 *				parent2.genes 	[[aabb][ccdd]]  @444[ [@555] [@666] ]
 *
 *				child1.genes 	[[abcd][ccdd]]  @777[ [@222] [@666] ] //copies of parent-gene references
 *
 *			In this case - what would be wrong with a mutateShallow() style implementation
 *				as per the method below with the same name? (see method mutateShallow() below)
 *
 *			3) In the method 
 *					void mutateDeep(Gene theGene){
 *						theGene = (Gene)theGene.clone();
 *						...
 *					}
 *				what is the significance of assigning the parameter 'theGene' to a clone of the argument
 *				passed in? Particularly in the first line: i.e. would this be better than say...
 *					void mutateDeep(Gene theGene){
 *						Gene clone = (Gene)theGene.clone();
 *						...
 *					} */ 
import java.util.*;

class Gene implements Cloneable {
  char[] geneArray;
  Gene(String geneValue) { geneArray = geneValue.toCharArray(); }
  public Gene clone() {
    Gene clone = null;
    try {
		clone = (Gene)super.clone();
		
    } catch(CloneNotSupportedException e) {
      System.err.println("MyObject can't clone");
    }
    return clone;
  }
  public void set(int index, char value){
	geneArray[index] = value;
  }
  public int length(){
	return geneArray.length;
  }
  public String value(){ 
	return new String(geneArray);
  }
}

class TestGeneMutate {
  
  static void mutateDeep(Gene theGene) {
    System.out.println( "deep mutate\t:");
	theGene = (Gene)theGene.clone(); 					// Deep copy the Gene
    int mutateIndex = (int)(Math.random()*theGene.length());
    theGene.set(mutateIndex, 'x');						// set copy, original unaltered
  }
  static void mutateShallow(Gene theGene) {				
	System.out.println( "shallow mutate\t:");			// Shallow copy of the Gene
	int mutateIndex = (int)(Math.random()*theGene.length());
    theGene.set(mutateIndex, 'x');						// outside object altered
  }
  static void test(Gene a, Gene b){
	System.out.println("a value is = " + a + ":" + a.value());
    System.out.println("b value is = " + b + ":" + b.value());
    
	if(a == b) {
      System.out.println("a == b");
    }else{ 
      System.out.println("a != b");
    }
  }
  public static void main(String[] args) {
    Gene a = new Gene("agtc");
    Gene b = a.clone();
	test(a, b);
	
	mutateDeep(a);
	test(a, b);
	mutateShallow(a);
	test(a, b);
  
  }
} 