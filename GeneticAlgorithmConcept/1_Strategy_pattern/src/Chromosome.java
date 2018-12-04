abstract class Chromosome{
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