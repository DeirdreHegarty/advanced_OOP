//[Foo.C] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo()              	// definition for Foo's constructor
	{
		cout<<"Foo: Foo() constructor" << endl;
		i_a = 1;
		i_b = 2;
		d_a = 3.14;
		d_b = 2.45;
	}
	void Foo::doX(){
		cout<<"Foo::doX() running"<<endl; 
		cout<< "\ti_a: " << i_a << "\n" << "\ti_b: " << i_b << "\n";
		cout<< "\td_a: " << d_a << "\n" << "\td_b: " << d_b << "\n";
	}