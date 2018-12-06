/**
 * @author Deirdre Hegarty
 * @version 1.0
 * @since 2018-12-07
 */
import factory.*;
import behaviours.*;
import strategy.*;
import subclasses.Couple;
import subclasses.Individual;

class Runner{
	public static void main(String [] args){
		Chromosome chromosome1 = new Individual("1101100100110110");
		Chromosome chromosome2 = new Individual("1101111000011110");
	
		System.out.println("******************* Factory Method *****************************");
		// Factory Method
		ChromeFactory factoryMethod = new IndividualGetter();
		Chromosome factoryChromosome = factoryMethod.getChrome("1111111111111111");
		System.out.println(factoryChromosome.getName());
		factoryChromosome.mutate();
		System.out.println(factoryChromosome.getName());

		System.out.println("******************* Abstract Factory *****************************");
		// Abstract factory
		BigGAFactory bigFactory = new BigGAFactory();
		Mutate m = bigFactory.createMutatorGA(checkMutant.ISMUTANT);
		Chromosome bigFChrome = new Individual("1101100100110110");
		System.out.println(bigFChrome.getName());
		bigFChrome.setMutation(m);
		bigFChrome.mutate();
		System.out.println(bigFChrome.getName());

		Chromosome [] i = {chromosome1, chromosome2};
		Population pop = new Population(i);
		Selection s = bigFactory.createSelectGA(checkFitness.BIGGEST);
		pop.setSelection(s);
		pop.select();

		Couple c1 = new Couple(chromosome1, chromosome2);
		c1.crossover();

		System.out.println("******************* Abstract Factory Singleton *****************************");
		// Abstract factory Singleton
		RandomGAFactory randomFactorySingleton = RandomGAFactory.createRGF();
		// RandomGAFactory g2 = RandomGAFactory.createRGF();
		// RandomGAFactory g3 = RandomGAFactory.createRGF();
		Mutate m1 = randomFactorySingleton.createMutatorGA(checkMutant.NOTMUTANT);
		Chromosome randFChrome = new Individual("1101100100110110");
		System.out.println(randFChrome.getName());
		randFChrome.setMutation(m1);
		randFChrome.mutate();
		System.out.println(randFChrome.getName());
	}
}