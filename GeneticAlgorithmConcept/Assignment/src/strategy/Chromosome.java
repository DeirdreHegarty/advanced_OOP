package strategy;
import behaviours.Mutate;
import behaviours.Crossover;

public abstract class Chromosome{
	/**
	 * Chromosome is an example of a strategy pattern.The Chromosome name/encoding, and mutate and crossover behaviours can be set here.
	 */
	// instance variables
	Crossover crossoverBehaviour;
	protected Mutate mutateBehaviour;

	String name;

	public Chromosome(String aName){
		this.name = aName;
		System.out.println("New Chromosome created");
	}

	public Chromosome mutate() {
		// Mutate itself (call mutation behaviour on self)
		mutateBehaviour.mutation(this);
		return this;
	}
	public void crossover(){
		crossoverBehaviour.crossover();
	}

	public String getName(){
		return this.name;
	}
	public void setName(String aName){
		this.name = aName;
	}
	public void setMutation(Mutate m){
		mutateBehaviour = m;
	}
	void setCrossover(Crossover c){
		crossoverBehaviour = c;
	}
}