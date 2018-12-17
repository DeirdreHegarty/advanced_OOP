/*
//Foo.h
class Foo               	
{
	public:                 
		int a;       		
					//Note: there's no constructor
		~Foo();				
		void doX();			
	          
};
*/
//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
		
	Foo::~Foo(){					// "Destructor"
		cout<< "~Foo()" << endl;
		cout<< "Destructor runs when 'f' out of scope" <<endl;
	}	
	
	void Foo::doX(){
		cout<<"doX() running"<<endl; 
		cout<< "\ta: " << a <<endl;
	}