
#include <iostream>
#include "Inheritance.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}
	
	void A::doX(){					//A::doX() is declared abstract (pure virtual)
		cout<< "A::doX()" <<endl;	// in the Header file: this doesn't prevent you
	}								// from providing default implementation
	
	B::B(){
		cout<< "B()" <<endl;
	}
		
	void B::doX(){
		A::doX();						//which you can call-upon like this
		cout<< "B::doX()" <<endl;
	}

/*
 *  http://stackoverflow.com/questions/357307/how-to-call-a-parent-class-function-from-derived-class-function
 *	"...
 *	 You should note that unlike Java and C#, C++ does not have a keyword for 
 *		"the base class" ('super' or 'base') since C++ supports multiple inheritance 
 *		which may lead to ambiguity.
 *  ..."
 */