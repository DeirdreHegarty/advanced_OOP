//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo()              	
	{
		cout<< "Foo()" << endl;
		a = 0; 							       	
		b = 0;
	}									
	// HERE: See the header-file declaration for doX().
	// The doX() function can be called with just one arg.  
	// If no value for 'b' is supplied the default value of 5 is used
	void Foo::doX(int aVal, int bVal){			
		cout<<"doX(:int, :int) running"<<endl; 	
		a = aVal;
		b = bVal;						//bVal defaults to 5
	}
	
	