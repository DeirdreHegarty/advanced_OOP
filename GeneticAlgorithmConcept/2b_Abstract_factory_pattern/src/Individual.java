class Individual extends Chromosome{

	public Individual(String aName){
		super(aName);

		System.out.println("New Individual");

		mutateBehaviour = new IsMutant(); 		// mutateBehaviour is inherited (default value)

	}
}