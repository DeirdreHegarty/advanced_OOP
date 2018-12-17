/*[Test.cpp]
 *The only difference here is that the 
 * class Foo has been declared without a default constructor
 *	Foo() 
 *  
 *	Note the compile error saying: 
 *		" error: no matching function for call to ‘Foo::Foo()’
 *			 Foo f1;"
 *
 */

#include <iostream>
#include "Foo.h"			
using namespace std;

int main(){
	Foo f1;		//No round-brackets after 'f1' makes the 		
				// compiler assume you want to call the 
}				// "default" (no-arg) constructor
				// ... but it doesn't exist