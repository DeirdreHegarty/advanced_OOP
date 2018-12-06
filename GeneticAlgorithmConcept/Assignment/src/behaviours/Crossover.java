package behaviours;

import strategy.Chromosome;

public interface Crossover{
	/**
	 * This forces anything that implements Crossover
	 * to have a crossover behaviour.
	 * @return Array of strategy.Chromosome.
	 */
	public Chromosome [] crossover();
}