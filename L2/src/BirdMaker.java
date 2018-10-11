/*
*	This is a main class, which intends to create an array of type
*	Bird {abstract}, and populate it randomly with the concrete types:
*		BlackBird or Emu
*	after which, a call to sing() is made. Depending on the concrete
*	object type, a differing sing() implementation should execute.
*
* TO RUN: from inside `/src`
* `javac -d ../bin *.java && java -cp ../bin BirdMaker`
*
*/
import java.util.Random;

class BirdMaker
{

	public static void main(String[] args)
	{
		Bird[] birds = new Bird[6];			//new empty Bird[] array
		Random r = new Random();
		int max = 1;
		int min = 0;

		System.out.println("----------------------------");
		for( int i = 0; i < birds.length ; i++) 
		{
			
			int birdType = r.nextInt((max - min) + 1) + min;

			if (birdType == 0){
				birds[i] = new Emu();
			}
			else if (birdType == 1){
				birds[i] = new BlackBird();
			}
			birds[i].sing();
			System.out.println("----------------------------");
		}
	}
}

