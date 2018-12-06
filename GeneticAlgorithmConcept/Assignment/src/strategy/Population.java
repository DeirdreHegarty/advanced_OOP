package strategy;

import behaviours.Selection;

public class Population{
	/**
	 * A Population can determine the selection behaviour, and uses a strategy pattern. 
	 * If selection takes place, a Population then only contains 2 Chromosomes.
	 */
	Selection selectBehaviour;
	Chromosome [] pop;
	public Population(Chromosome [] inArr){
		this.pop = inArr;
	}
	public Chromosome [] select(){
		return selectBehaviour.selection(pop); 
	}
	public void setSelection(Selection s){ 
		selectBehaviour = s ;
	}

}