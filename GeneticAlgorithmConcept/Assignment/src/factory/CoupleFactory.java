package factory;
import strategy.Chromosome;
import subclasses.Couple;
// Factory Method Pattern
public abstract class CoupleFactory{
	/**
	 * getCouple makes a call to the abstract method getCoupleSubclass, contained inside CoupleFactory.
	 * @param c1 strategy.Chromosome
	 * @param c2 strategy.Chromosome
	 * @return call to getCoupleSubclass
	 */
 	Couple getCouple(Chromosome c1, Chromosome c2){
		System.out.println("Inside abstract CoupleFactory");
		return getCoupleSubclass(c1, c2);//abs below 
	}
	// factory method
	abstract Couple getCoupleSubclass(Chromosome c1, Chromosome c2);// <---- factory method 
}