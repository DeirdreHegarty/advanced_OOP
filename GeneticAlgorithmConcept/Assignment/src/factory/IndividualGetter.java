package factory;

import strategy.Chromosome;
import subclasses.Individual;

// Factory Method Pattern
public class IndividualGetter extends ChromeFactory{
/**
 * getChromeSubclass is what is called by ChromeFactory as part of a factory method
 * @param inputString This corresponds to the name/encoding of the Chromosome object.
 * @return subclass of Chromosome 
 * @see factory.ChromeFactory#getChromeSubclass(java.lang.String)
 */
	Chromosome getChromeSubclass(String inputString){ 		// <---- factory method 
		System.out.println("Inside IndividualGetter");
		return new Individual(inputString);
	}
}
