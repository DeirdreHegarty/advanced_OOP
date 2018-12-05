/*
 * TASK01: Examine the code in this folder and make 
 * whatever changes are necessary to get it to 
 * compile and execute. [See TASK in ClassicFiddle.java]
 * 
 * TASK02: Remove the 'package classic;' statement 
 *			from this file and repeat the task01 
 */
package classic;	//Remove this for task02

class Runner{
	public static void main(String[] args){
		ClassicFiddle cf = new ClassicFiddle();
		cf.play();		//compile error! why?
		cf.playSweetly();
	}
}