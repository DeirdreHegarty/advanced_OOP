package subclasses;

import behaviours.Selection;
import strategy.Chromosome;

abstract class Fitness implements Selection{
	public abstract int fitness(Chromosome c);
	/**
	 * @param chromes This is an Array for strategy.Chromosome
	 * @return An array of strategy.Chromosomes
	 * @see behaviours.Selection#selection(strategy.Chromosome[])
	 */
	public Chromosome [] selection(Chromosome [] chromes) {
		Chromosome [] selected = new Chromosome[2];
		// assume the first in the list are the "most fit"
		selected[0] = chromes[0];
		selected[1] = chromes[1];

		// choose the top 2 best results
		for(int i=0; i < chromes.length; i++){

			if(fitness(chromes[i]) > fitness(selected[0])){
				selected[1] = selected[0] ; // second largest is old largest
				selected[0] = chromes[i];	// assign new largest
			}
			else if(fitness(chromes[i]) > fitness(selected[1])){
				selected[1] = chromes[i];
			}
		}

		return selected;
	}
}