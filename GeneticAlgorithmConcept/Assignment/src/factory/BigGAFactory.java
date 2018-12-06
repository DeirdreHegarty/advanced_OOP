package factory;

import behaviours.Mutate;
import behaviours.Selection;
import subclasses.IsMutant;
import subclasses.NotMutant;
import subclasses.TheBiggest;

// concrete factory
public class BigGAFactory implements GA{
	/**
	 * This is a concrete factory.
	 * @param input This is an enum factory.checkMutant
	 * @return If the enum passed is ISMUTANT then return an IsMutant() object, likewise for
	 * NOTMUTANT, else return null.
	 */
	public Mutate createMutatorGA(checkMutant input){
		if(input == checkMutant.ISMUTANT)
			return new IsMutant();
		else if(input == checkMutant.NOTMUTANT)
			return new NotMutant();
		return null;
	}
	/**
	 * 
	 * @param input This is an enum factory.checkFitness
	 * @return If the enum passed is BIGGEST then return a TheBiggest() object, else return null.
	 */
	public Selection createSelectGA(checkFitness input){
		if(input == checkFitness.BIGGEST)
			return new TheBiggest();
		return null;
	}

	
}