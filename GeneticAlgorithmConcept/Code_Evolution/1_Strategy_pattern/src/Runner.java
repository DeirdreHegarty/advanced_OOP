class Runner{
	public static void main(String [] args){
		Chromosome chromosome1 = new Individual("1101100100110110");
		Chromosome chromosome2 = new Individual("1101111000011110");
		Chromosome chromosome3 = new Individual("1111111111111111");
		Chromosome chromosome4 = new Individual("1101111000011110");
		chromosome1.setMutation(new IsMutant());
		// System.out.println(chromosome1.getName());
		chromosome1.mutate();
		// System.out.println(chromosome1.getName());

		Couple c1 = new Couple(chromosome1, chromosome2);
		c1.crossover();

		Chromosome [] i = {chromosome1, chromosome2, chromosome3, chromosome4};
		Population p = new Population(i);

		for (int j =0; j< p.pop.length; j++){
			System.out.println(p.pop[j].getName());
		}
		System.out.println("*******");
		p.setSelection(new TheBiggest());
		
		Chromosome [] cout = p.select();
		for (int j =0; j< cout.length; j++){
			System.out.println(cout[j].getName());
		}
	}
}