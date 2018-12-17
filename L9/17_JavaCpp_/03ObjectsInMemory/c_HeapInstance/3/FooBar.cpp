/*
 * This is an improvement - see how construction and 
 *	destruction are now managed.
 */
//[FooBar.cpp] 
#include <iostream>
#include "FooBar.h"
using namespace std;
		
	Foo::Foo(){
		aBar = new Bar();				
		cout<<"Foo(): aBar = "<< aBar <<endl; 
	}
	
	Foo::~Foo(){											// "Destructor"
		cout<< "Foo() destructor" << endl;
		cout<< "\tdelete aBar;" << endl;
		delete aBar;
	}	
	//Now, useBar() can only be called after a Foo
	// 	has been constructed (wherein, 'aBar' is assigned);
	void Foo::useBar(){
		cout<<"useBar(): calling aBar->doBarThing()"<<endl; 
		aBar->doBarThing();
	}
	
	Bar::~Bar(){											// "Destructor"
		cout<< "~Bar() destructor" << endl;
	}
	
	void Bar::doBarThing(){
		cout<<"Bar::doBarThing()"<<endl; 
	}