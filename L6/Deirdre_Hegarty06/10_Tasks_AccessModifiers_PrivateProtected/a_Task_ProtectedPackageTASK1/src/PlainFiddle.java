package plain;

public class PlainFiddle{
						
	// can either be made `public` or `protected` and will work for this example
	public void play(){
	// protected void play(){ 				// 01 made protected
		System.out.println(this);
		System.out.println("play():\t\t plays ");
	}
	
}
/*
 * Above, changing to 'protected void play(){...'
 * allows access to sub-classes that are outside of
 * the 'plain' package. 
 * 
 * << Access through inheritance >>
 *
 * Making it `public` would mean allowing access from outside the package
 * through a ref.
 * Meaning `cf.play();` in Runner.java will work
 */ 