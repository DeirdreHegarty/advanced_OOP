//Test.cpp
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	//Observe the printouts below.
	cout<<"A *a = new B(); // causes..."<<endl;
	A *a = new B();		
	cout<<"a->doX() results in call to..."<<endl;
	a->doX();			//attempt polymorphic call
	cout<<"polymorphism not working"<<endl;
}

/**
*	In C++, polymorphism does not "work" by default...
*		you must explicitly mark your header-file
*		function declarations as 'virtual' to get
*		the behaviour you'd expect from Java
*/