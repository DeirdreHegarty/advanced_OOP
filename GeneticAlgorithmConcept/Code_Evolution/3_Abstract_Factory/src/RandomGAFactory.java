class RandomGAFactory implements GA{
	public Mutate createMutatorGA(String input){
		if(input.equals("Is Mutant"))
			return new IsMutant();
		else if(input.equals("Not Mutant"))
			return new NotMutant();
		return null;
	}
	public Selection createSelectGA(String input){
		return new TheRandom();
	}
}