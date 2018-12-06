package behaviours;

import strategy.Chromosome;

public interface Mutate{
	/**
	 * This forces anything that implements Mutate
	 * to have a mutate behaviour.
	 * @param c strategy.Chromosome is part of a strategy pattern.
	 */
	public void mutation(Chromosome c);
}