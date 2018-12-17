//test.cpp
#include <iostream>
#include "Foo.h"			
using namespace std;

int main(){
	Foo f;				// In C++, 'Foo f' creates an instance of Foo (an Object)
	cout<<"Foo f;"<<" //Object created, no 'Foo()' output as no constructor"<<endl;
	cout<<"f.doX(); causes..."<<endl;
	f.doX();			//  Access to members of that Object with '.' (dot)
	f.a = 4;
	cout<< "f.a = 4;  //After statement a is: " << f.a << endl;			

	//Note: Foo::~Foo() destructor will run
	// 		when f goes out of scope
}
/*
 * Before, '*f' was a pointer to a instance of Foo
 * (a Heap Object). Access to members with '->'.
 *
 * 	Foo *f = new Foo();	
 *	f->doX();				 
 *  delete f;
 */ 