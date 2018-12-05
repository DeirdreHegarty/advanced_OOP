/*
 * TASK01: Examine the code in this folder and make 
 * whatever changes are necessary to get it to 
 * compile and execute.
 * 
 */
package classic;	
class Runner{
	public static void main(String[] args){
		ClassicFiddle cf = new ClassicFiddle();
		//cf.play();		
		/*
		* To get the above to work play() would need yo be `public`
		* and not `protected`. Because play() is using a referenece and has not been inherited
		* from a super class it will not work.
		*
		* EXTRA EXPLANATION IN PlainFiddle.java
		*/
		cf.playSweetly();
	}
}