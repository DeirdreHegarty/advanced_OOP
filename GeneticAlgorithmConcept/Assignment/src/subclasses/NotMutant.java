package subclasses;
import behaviours.Mutate;
import strategy.Chromosome;

public class NotMutant implements Mutate{
	/**
	 * This is used to determine what sort of mutate behaviour is used as part of a strategy pattern in Chromosome.
	 * @param c strategy.Chromosome
	 * @return Nothing.
	 * @see behaviours.Mutate#mutation(strategy.Chromosome)
	 */
	public void mutation(Chromosome c){
		System.out.println("I am NOT mutated");
	}
}