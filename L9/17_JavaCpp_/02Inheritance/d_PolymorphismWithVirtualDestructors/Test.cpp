//Test.cpp
/*
 * In this example, we try 3 statements: 	
 * 		A *a = new B();		//create an A ptr to a B object
 *		a->doX();			//call doX() through 'a'
 *		delete a;			//Then try to delete everything
 * but we see that the ~B() destructor is not called, as the
 * ~A() destructor is not _virtual_ in the header file.
 */
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	//Observe the printouts below.
	cout<<"A *a = new B(); // causes..."<<endl;
	A *a = new B();		
	cout<<"a->doX() results in call to..."<<endl;
	a->doX();			//attempt polymorphic call
	cout<<"polymorphism IS working"<<endl;
	cout<<"delete a;"<<" causes..."<<endl;
	delete a;
}
	

