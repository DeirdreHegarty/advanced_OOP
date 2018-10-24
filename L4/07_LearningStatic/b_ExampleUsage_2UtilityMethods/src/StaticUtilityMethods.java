/**
 *	Example of static usage: utility methods to 
 *		carry out maths operations
 */
class NumberCruncher
{
	//utility methods
	static int add(int number1, int number2){
		return number1 + number2;
	}
	
	static int multiply(int number1, int number2)
	{
		return number1 * number2;
	}

}

class Runner{
	public static void main(String[] args){
		int addResult = NumberCruncher.add(4, 2);		
		int multiplyResult = NumberCruncher.multiply(4, 2);
		
		System.out.println("+ result: "+addResult);
		System.out.println("* result: "+multiplyResult);

	}
}

/*
 *	TASK: 1. Try the following and see that it works...
 *			NumberCruncher n = new NumberCruncher();
 *			int addResult = n.add(4.2);
 *
 *		It works because Java allows you to access
 *			static members through an object reference.
 *
 *	NOTE:
 *		If you are familiar with java.util.Math class, you 
 *		can think of a time when you may have done...
 *			double random = Math.random();
 *
 *		Hopefully you can see now that Math.random() 
 *			is a static utility method also.
 */