// ***** Strategy pattern ***********
import java.util.Random;

// behaviours as interfaces
interface Crossover{
	public Chromosome [] crossover();
}
interface Mutate{
	public void mutation(Chromosome c);
}
interface Selection{
	public Chromosome [] selection(Chromosome [] chromesin);
}
abstract class Chromosome{
	// pass a factory
	MutantIngredientFactory mfactory;

	// instance variables
	Crossover crossoverBehaviour;
	Mutate mutateBehaviour;

	String name;

	public Chromosome(String aName){
		this.name = aName;
		System.out.println("New Chromosome created");
	}

	public void mutate() {
		// Mutate itself (call mutation behaviour on self)
		mutateBehaviour.mutation(this);
	}
	public void crossover(){
		crossoverBehaviour.crossover();
	}

	String getName(){
		return this.name;
	}
	void setName(String aName){
		this.name = aName;
	}
	void setMutation(Mutate m){
		mutateBehaviour = m;
	}
	void setCrossover(Crossover c){
		crossoverBehaviour = c;
	}
}
class Individual extends Chromosome{
	MutantIngredientFactory mfactory;

	public Individual(String aName, MutantIngredientFactory cfactory){
		super(aName);
		this.mfactory = cfactory;
		System.out.println("New Individual");

		mutateBehaviour = new NotMutant(); 		// mutateBehaviour is inherited (default value)

	}
}
class IsMutant implements Mutate{
	public void mutation(Chromosome c){

		Random rand = new Random();
		int n = rand.nextInt(15) + 0;

		char [] temp = c.getName().toCharArray();
		if(temp[n] == '1'){
			temp[n] = '0';
		}
		else if (temp[n] == '0'){
			temp[n] = '1';
		}

		c.setName(String.valueOf(temp));
	}
}
class NotMutant implements Mutate{
	public void mutation(Chromosome c){
		System.out.println("I am NOT mutated");
	}
}
class Couple implements Crossover{

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

		MutantStore ms = new IndividualStore();

		offspring[0] = ms.createChrome(a1+b2);
		offspring[1] = ms.createChrome(b1+a2);

		System.out.println("Offspring 1 : "+offspring[0].getName());
		System.out.println("Offspring 2 : "+offspring[1].getName());
		return offspring;
	}
}
class Population{
	Selection selectBehaviour;
	Chromosome [] pop;
	public Population(Chromosome [] inArr){
		this.pop = inArr;
	}
	public void select(){
		selectBehaviour.selection(pop);
	}
	void setSelection(Selection s){
		selectBehaviour = s ;
	}

}
abstract class Fitness implements Selection{
	public abstract int fitness(Chromosome c);

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

// Example of Fitness
class TheBiggest extends Fitness{
	public int fitness(Chromosome c) {
		return Integer.parseInt(c.getName(), 2);
	}

}
class Runner{
	public static void main(String [] args){

		MutantStore ms = new IndividualStore();
		Chromosome chromosome1 = ms.createChrome("1111111111111111");
		Chromosome chromosome2 = ms.createChrome("1111111111111111");
		Chromosome chromosome3 = ms.createChrome("1101100100110110");
		Chromosome chromosome4 = ms.createChrome("1101111000011110");
		System.out.println("**************\n");

		System.out.println("chromosome1 : "+chromosome1.getName());
		// System.out.println(chromosome4.getName());
		chromosome1.mutate();
		System.out.println("chromosome1 mutated : "+chromosome1.getName());
		System.out.println("**************\n");


		Couple c1 = new Couple(chromosome3, chromosome4);
		c1.crossover();
		System.out.println("**************\n");


		Chromosome [] i = {chromosome1, chromosome2};
		Population p = new Population(i);
		p.setSelection(new TheBiggest());
		p.select();
		System.out.println("**************\n");

	}
}