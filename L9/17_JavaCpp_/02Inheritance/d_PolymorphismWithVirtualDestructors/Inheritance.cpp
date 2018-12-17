//[Inheritance.cpp]
#include <iostream>
#include "Inheritance.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}
	
	A::~A(){
		cout<< "~A() destructor" <<endl;
	}
	
	void A::doX(){
		cout<< "A::doX()" <<endl;
	}
	
	B::B(){
		cout<< "B()" <<endl;
	}
	
	B::~B(){
		cout<< "~B() destructor" <<endl;
	}
	
	void B::doX(){
		cout<< "B::doX()" <<endl;
		
	}