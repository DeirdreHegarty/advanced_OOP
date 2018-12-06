package factory;

import subclasses.Couple;
import strategy.Chromosome;
// Factory Method Pattern
class CoupleGetter extends CoupleFactory{
	/**
	 * getChromeSubclass is what is called by CoupleFactory as part of a factory method
	 * @param c1 strategy.Chromosome 
	 * @param c2 strategy.Chromosome
	 * @return Couple object
	 * @see factory.CoupleFactory#getCoupleSubclass(strategy.Chromosome, strategy.Chromosome)
	 */
	Couple getCoupleSubclass(Chromosome c1, Chromosome c2){ 		// <---- factory method 
		System.out.println("Inside CoupleGetter");
		return new Couple(c1, c2);
	}
}