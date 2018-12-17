//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo(){
		cout<< "Foo()" <<endl;
	}
	
	Foo::Foo(int anA){
		cout<< "Foo(int anA)" <<endl;
	}
	
	Foo::~Foo(){											// "Destructor"
		cout<< "Foo() destructor" << endl;
	}	
	
	void Foo::doX(){
		cout<<"inside Foo::doX()"<<endl; 
		cout<< "\ta is: " << a <<endl;
	}