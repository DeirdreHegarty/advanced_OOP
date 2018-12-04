import java.util.Random;
class IsMutant implements Mutate{
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