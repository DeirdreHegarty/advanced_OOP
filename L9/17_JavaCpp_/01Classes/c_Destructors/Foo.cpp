/*
//[Foo.h] 
class Foo               	
{
	public:                 
		Foo();              
		~Foo();				//Now "Foo.h" declares a "Destructor"
		void doX();			
	protected:              
		int i_a, i_b;       
	private:
		double d_a, d_b;
};
*///[Foo.C] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo()  : i_a(1), i_b(2), d_a(3.14), d_b(2.45)       // "initializer list"
	{
		cout<< "Foo() constructor" << endl;
		
	}
	
	Foo::~Foo(){											// "Destructor"
		cout<< "Foo() destructor" << endl;
		cout<< "\trunning after delete called" << endl;
		cout<< "\t(Typically clean-up code)" << endl;
	}	
	
	void Foo::doX(){
		cout<<"doX() running"<<endl; 
		cout<< "\ti_a: " << i_a << "\n" << "\ti_b: " << i_b << "\n";
		cout<< "\td_a: " << d_a << "\n" << "\td_b: " << d_b << "\n";
	}