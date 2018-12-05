import java.util.Random;
class TheRandom extends Fitness{
	public int fitness(Chromosome c) {
		Random rand = new Random();
		int n = rand.nextInt(15) + 0;
		int randNum = Integer.parseInt(c.getName(), 2) + n;
		return randNum;
	}
}