/*
//Header file declarations reproduced here
// for quick access
class A
{
	public:
		A();
		virtual void doX();	
};							

class B : public A
{
	public:
		B();
		void doX();		
};
*/
#include <iostream>
#include "Inheritance.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}

	void A::doX(){
		cout<< "A::doX()" <<endl;
	}
	
	B::B(){
		cout<< "B()" <<endl;
	}
	
	void B::doX(){
		cout<< "B::doX()" <<endl;
		
	}