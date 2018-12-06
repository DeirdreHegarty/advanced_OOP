package factory;

import behaviours.Mutate;
import behaviours.Selection;

interface GA{
	/*
	 * Abstract Factory
	 */
	public Mutate createMutatorGA(checkMutant input);
	public Selection createSelectGA(checkFitness input);
}