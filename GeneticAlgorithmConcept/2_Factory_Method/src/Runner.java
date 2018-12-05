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
		System.out.println("********************\n");
		Chromosome [] cout = p.select();
		for (int j =0; j< cout.length; j++){
			System.out.println(cout[j].getName());
		}

		// Factory Method
		ChromeFactory cm = new IndividualGetter();
		Chromosome t1 = cm.getChrome("1111111111111111");
		System.out.println(t1.getName());
		t1.mutate();
		System.out.println(t1.getName());

	}
}