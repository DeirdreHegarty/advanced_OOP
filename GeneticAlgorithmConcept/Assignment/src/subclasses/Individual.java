package subclasses;

import strategy.Chromosome;

public class Individual extends Chromosome{
	/**
	 * @param aName This reflects the name String that is defined in the super class
	 */
	public Individual(String aName){
		super(aName);

		System.out.println("New Individual");

		mutateBehaviour = new IsMutant(); 		// mutateBehaviour is inherited (default value)

	}
}