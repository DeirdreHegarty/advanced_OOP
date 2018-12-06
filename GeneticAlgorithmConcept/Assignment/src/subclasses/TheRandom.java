package subclasses;

import java.util.Random;
import strategy.Chromosome;


public class TheRandom extends Fitness{
	/**
	 * This method extends Fitness, and is part of how selection happens according to fitness.
	 * @param c strategy.Chromosome
	 * @return int
	 * @see subclasses.Fitness#fitness(strategy.Chromosome)
	 */
	public int fitness(Chromosome c) {
		Random rand = new Random();
		int n = rand.nextInt(15) + 0;
		int randNum = Integer.parseInt(c.getName(), 2) + n;
		return randNum;
	}
}