class Population{
	Selection selectBehaviour;
	Chromosome [] pop;
	public Population(Chromosome [] inArr){
		this.pop = inArr;
	}
	public Chromosome [] select(){
		selectBehaviour.selection(pop);
	}
	void setSelection(Selection s){
		selectBehaviour = s ;
	}

}