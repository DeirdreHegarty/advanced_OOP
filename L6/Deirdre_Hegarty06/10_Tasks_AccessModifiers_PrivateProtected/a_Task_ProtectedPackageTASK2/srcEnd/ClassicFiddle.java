/*
 * A programmer is trying to create the class ClassicFiddle 
 * such that it inherits the 'PlainFiddle.play()' method.
 * The idea is to allow a ClassicFiddle to not only 'play()'
 * but to 'playSweetly()'. To achieve this, the programmer
 * wants to re-use 'PlainFiddle.play()' through inheritance
 * but it won't compile?
*/
package classic;
import plain.PlainFiddle;

public class ClassicFiddle extends PlainFiddle{
	void playSweetly(){	
		play();		//attempt access through inheritance
		System.out.println("playSweetly():\t & plays sweetly");
	}
}
/*
 * Above, the call to 'play()' is correct, the 
 * problem is that ClassicFiddle is in 
 * another package ('classic' not 'plain'), and
 * that the method 'PlainFiddle.play()' has no modifier (+,-,#) 
 * meaning it has package (~) access; i.e. even though
 * ClassicFiddle inherits from PlainFiddle, 
 * it is restricted from accessing play().
 * The solution is to make 'PlainFiddle.play()' protected (#),
 * to allow access from another package through
 * inheritance.
 */
