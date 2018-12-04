// Example of Fitness
class TheBiggest extends Fitness{
	public int fitness(Chromosome c) {
		return Integer.parseInt(c.getName(), 2);
	}

}