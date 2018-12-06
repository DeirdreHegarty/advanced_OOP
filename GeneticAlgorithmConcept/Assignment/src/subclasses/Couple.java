package subclasses;

import behaviours.Crossover;
import strategy.Chromosome;

public class Couple implements Crossover{
	/**
	 * A Couple object can crossover/reproduce, and is made of an array of 2 Chromosomes
	 */

	Chromosome parentA;
	Chromosome parentB;

	public Couple(Chromosome i1, Chromosome i2){
		this.parentA = i1;
		this.parentB = i2;
	}
	public Chromosome [] crossover(){
		String a1 = parentA.getName().substring(0 , 5);
		String a2 = parentA.getName().substring(5, parentA.getName().length());
		String b1 = parentB.getName().substring(0, 5 );
		String b2 = parentB.getName().substring(5, parentB.getName().length());
		
		Chromosome offspring [] = new Chromosome [2];
		offspring[0] = new Individual(a1+b2);
		offspring[1] = new Individual(b1+a2);

		System.out.println("Offspring 1 : " + offspring[0].getName());
		System.out.println("Offspring 1 : " + offspring[1].getName());
		return offspring;
	}
}