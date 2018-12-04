class Runner{
	public static void main(String [] args){
		Chromosome chromosome1 = new Individual("1101100100110110");
		Chromosome chromosome2 = new Individual("1101111000011110");
		chromosome1.setMutation(new IsMutant());
		// System.out.println(chromosome1.getName());
		chromosome1.mutate();
		// System.out.println(chromosome1.getName());

		Couple c1 = new Couple(chromosome1, chromosome2);
		c1.crossover();

		Chromosome [] i = {chromosome1, chromosome2};
		Population p = new Population(i);
		p.setSelection(new TheBiggest());
		p.select();
	}
}