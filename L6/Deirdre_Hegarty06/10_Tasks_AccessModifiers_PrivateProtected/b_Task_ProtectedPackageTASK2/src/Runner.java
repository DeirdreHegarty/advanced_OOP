/*
 * TASK02: Remove the 'package classic;' statement 
 *			from this file and repeat the task01 
 */

// default package
import classic.ClassicFiddle; // 01 imported for ClassicFiddle()

class Runner{
	public static void main(String[] args){
		ClassicFiddle cf = new ClassicFiddle();
		cf.playSweetly();
	}
}