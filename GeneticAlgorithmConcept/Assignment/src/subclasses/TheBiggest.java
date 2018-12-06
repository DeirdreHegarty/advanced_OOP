package subclasses;

import strategy.Chromosome;

// Example of Fitness
public class TheBiggest extends Fitness{
	/**
	 * @param c strategy.Chromosome
	 * @return int
	 * @see subclasses.Fitness#fitness(strategy.Chromosome)
	 */
	public int fitness(Chromosome c) {
		return Integer.parseInt(c.getName(), 2);
	}

}