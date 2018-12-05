package plain;

public class PlainFiddle{
						//TASK: change to:
	protected void play(){ 		//protected void play(){
		System.out.println(this);
		System.out.println("play():\t\t plays ");
	}
	
}
/*
 * Above, changing to 'protected void play(){...'
 * allows access to sub-classes that are outside of
 * the 'plain' package.
 */