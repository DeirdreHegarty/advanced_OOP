class Runner{
	public static void main(String [] args){
		Chromosome chromosome1 = new Individual("1101100100110110");
		Chromosome chromosome2 = new Individual("1101111000011110");
	
		System.out.println("******************* Factory Method *****************************");
		// Factory Method
		ChromeFactory cm = new IndividualGetter();
		Chromosome t1 = cm.getChrome("1111111111111111");
		System.out.println(t1.getName());
		t1.mutate();
		System.out.println(t1.getName());

		System.out.println("******************* Abstract Factory *****************************");
		// Abstract factory
		BigGAFactory g = new BigGAFactory();
		Mutate m = g.createMutatorGA("Is Mutant");
		Chromosome chrome1 = new Individual("1101100100110110");
		System.out.println(chrome1.getName());
		chrome1.setMutation(m);
		chrome1.mutate();
		System.out.println(chrome1.getName());

		Chromosome [] i = {chromosome1, chromosome2};
		Population p = new Population(i);
		Selection s = g.createSelectGA("Biggest");
		p.setSelection(s);
		p.select();

		Couple c1 = new Couple(chromosome1, chromosome2);
		c1.crossover();
	}
}