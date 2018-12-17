//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
	
	Foo::Foo(int anA){
		cout<< "Foo(int anA)" <<endl;
	}
	
	Foo::~Foo(){											// "Destructor"
		cout<< "Foo() destructor" << endl;
		cout<< "\trunning after delete called" << endl;
		cout<< "\t(Typically clean-up code)" << endl;
	}
	
	void Foo::doX(){
		cout<<"doX() running"<<endl; 
		cout<< "\ta: " << a <<endl;
	}