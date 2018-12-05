To help understand Exceptions we will be looking at...
a) a program as a chain of method calls
b) a method that uses a 'return' mid-execution, if 
	a condition is true.
	
a) Looking at a program as a chain of method calls
By now, you may understand that most (if not all) computer programs 
work as a chain of method-calls, each calling on another to do its work 
until eventually it returns to the main method and the program is over.
In OO programming, these methods are positioned in different classes, so
ClassX, may have method doX(), and ClassY may have doY() and so forth.
As such you create a ClassX object and a ClassY object and you can then
call (or interact) with the methods doX() and doY().

class Runner{
	public static void main(String[] args){
		ClassX x = new ClassX();	//Create ClassX Object
		x.doX();					// call its 'doX()' method
	}
}
class ClassX{
    void doX(){
	    ClassY y = new ClassY();	//Create ClassY Object
		y.doY();					// call its 'doY()' method
	}
}

class ClassY{
    void doY(){
	    //...
	}
}

The code above executes first in the main method, then after
creating a ClassX Object, it goes to the doX() method, within
which it goes to the doY() method of ClassY and then returns
back to doX() and then back to main(..) and then the 
program is over.

We will use this way of looking at a program as a "chain" of 
method-calls to explain Exception Objects so keep this in mind.

b) Understanding that methods can return mid-execution
The second aspect of our explanation of Exception Objects and
their use, requires you to be aware that a method can 
return mid-execution if a condition is true:i.e. if we had the
partial program...

int result = divide( 4 , 2);

int divide(int a, int b){
	return a/b;
} 

we might change the divide(...) method to return early, returning
an error-code if the divide(...) is called with a zero as the 
second number: i.e.

int result = divide( 4, 0); //can't divide by zero

int divide(int a, int b){
    if( b == 0){
	    return -9999999; //return some error-code
	}
	
	return a/b; 	//otherwise divide and return result
}

Now, it should occur to you from the above code-sample, that
under the condition that 'b' is zero, the method returns before
the division is carried out; i.e. the statement 'return a/b;'
never gets to execute.

Keep this second piece of understanding in your mind.
