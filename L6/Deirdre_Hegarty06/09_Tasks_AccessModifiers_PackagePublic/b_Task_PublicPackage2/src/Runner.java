/*
 * Study the code in this folder and 
 *	a) identify the six changes required to make this compile and run. 
 */
package drinks;
class Runner{
	public static void main(String[] args){
		System.out.println("Run Cider");
		new Cider(); //has package access
	}
}