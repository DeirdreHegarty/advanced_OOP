
#include <iostream>
#include "Inheritance.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}
	
	B::B(){
		cout<< "B()" <<endl;
	}
		
	void B::doX(){					//Implement abstract function in B
		cout<< "B::doX()" <<endl;
	}
