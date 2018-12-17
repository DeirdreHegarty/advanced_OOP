/*[Test.cpp]
 * In this example the class 'Foo' (See Foo.h) has been declared with
 * two constructors:
 *	 - Foo() 
 *   - Foo(:int) 
 * C++ allows a local instance to be instantiated via: 
 *		- Foo f1; 
 * which causes the Foo() ("default constructor") to run.
 * Similarly, 
 * 		- Foo f2(100); 
 * which causes the corresponding Foo(:int) constructor run.
 */
#include <iostream>
#include "Foo.h"			
using namespace std;

int main(){
	cout<<"Running..."<<endl; 
	cout<<"\tFoo f1;"<<endl;
	cout<<"\tf1.doX();"<<endl;
	cout<< "\tf.a = 4;"<<endl;
	
	Foo f1;				//In C++, 'Foo f' creates an instance of Foo (an Object)
	f1.doX();			//Access to members of that Object with '.' (dot)
	f1.a = 4;
	cout<<"After statement 'f1.a = 4' a is: " << f1.a << endl;			
	cout<< "\n\n";
	cout<< "now running..." <<endl;
	cout<< "\tFoo f2(100);"<<endl;
	cout<< "\tf2.doX();" << endl;
	Foo f2(100);
	f2.doX();
}