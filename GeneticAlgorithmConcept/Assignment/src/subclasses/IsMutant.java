package subclasses;

import java.util.Random;
import behaviours.Mutate;
import strategy.Chromosome;

public class IsMutant implements Mutate{
	/**
	 * This is used to determine what sort of mutate behaviour is used as part of a strategy pattern in Chromosome.
	 * @param c strategy.Chromosome
	 * @see behaviours.Mutate#mutation(strategy.Chromosome)
	 */
	public void mutation(Chromosome c){

		Random rand = new Random();
		int n = rand.nextInt(15) + 0;

		char [] temp = c.getName().toCharArray();
		if(temp[n] == '1'){
			temp[n] = '0';
		}
		else if (temp[n] == '0'){
			temp[n] = '1';
		}

		c.setName(String.valueOf(temp));
	}
}