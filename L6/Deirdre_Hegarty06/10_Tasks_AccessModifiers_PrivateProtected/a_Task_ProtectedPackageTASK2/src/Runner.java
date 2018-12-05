/*
 *
 * TASK02: Remove the 'package classic;' statement 
 *			from this file and repeat the task01 
 */
// in default package
package classic.ClassicFiddle;	// 01 needs to be default package
class Runner{
	public static void main(String[] args){
		ClassicFiddle cf = new ClassicFiddle();
		
		// cf.play();	//doesn't work if play() is protected 
						//(because not in the same package & not inherited)
		cf.playSweetly();
	}
}