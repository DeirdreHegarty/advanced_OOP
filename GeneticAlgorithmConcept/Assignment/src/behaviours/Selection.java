package behaviours;

import strategy.Chromosome;

public interface Selection{
	/**
	 * This forces anything that implements Selection
	 * to have a selection behaviour.
	 * @param chromesin Array of strategy.Chromosome.
	 * @return Array of strategy.Chromosome.
	 */
	public Chromosome [] selection(Chromosome [] chromesin);
}