//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo()              	
	{
		cout<< "Foo()" << endl;
		a = 5;			       	
	}
	void Foo::doX(){
		cout<<"doX() running"<<endl; 
		print( 1 );						//calling inline function print(:int)
		print( 3.14 );					//calling inline function print(:double)
	}
	
	