package factory;

import behaviours.Mutate;
import subclasses.IsMutant;
import subclasses.NotMutant;
import subclasses.TheRandom;
import behaviours.Selection;

public class RandomGAFactory implements GA{
/**
 * This is a concrete factory that is also an example of a Singleton. There can only ever be one instance of a 
 * RandomGAFactory. This is thread safe and will only be created once.
 */
	//singleton
	private static RandomGAFactory _real;
	private RandomGAFactory(){
		 System.out.println("SINGLETON CONSTRUCTOR");
	}
	public static RandomGAFactory createRGF() 
	{ 
		// System.out.println("LAZY INITIALIZATION WITH DOUBLE CHECK LOCKING");
	    if (_real == null)  
	    { 
	      //synchronized block to remove overhead 
	      synchronized (RandomGAFactory.class) 
	      { 
	        if(_real==null) 
	        { 
	          // if _real is null, initialize 
	          _real = new RandomGAFactory(); 
	        } 
	        
	      } 
	    } 
	    return _real; 
	  }

	/**
	 * @param input This is a enum factory.checkMutant
	 * @return A subclass of Mutate interface (passed behaviour of Chromosome)
	 * @see factory.GA#createMutatorGA(factory.checkMutant)
	 */
	public Mutate createMutatorGA(checkMutant input){
		if(input == checkMutant.ISMUTANT)
			return new IsMutant();
		else if(input == checkMutant.NOTMUTANT)
			return new NotMutant();
		return null;
	}
	/**
	 * @param input This is a enum factory.checkFitness
	 * @return A random type of selection according to fitness
	 * @see factory.GA#createSelectGA(factory.checkFitness)
	 */
	public Selection createSelectGA(checkFitness input){
		return new TheRandom();
	}
}