/*
//Header file declarations reproduced here
// for quick access
class A
{
	public:
		A();
		void doX();
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
									// Must label definitions with
	void A::doX(){					// A::<method>(...)
		cout<< "A::doX()" <<endl;
	}
	
	B::B(){							
		cout<< "B()" <<endl;		
	}
	
	void B::doX(){					//...or B::<method(...)
		cout<< "B::doX()" <<endl;	// etc. to show which class you're implementing.
									// The intent here, is to override the doX() function
	}