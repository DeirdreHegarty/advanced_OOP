/*
//Header file declarations reproduced here
// for quick access
class A
{
	public:
		A();
};
class B : public A
{
	public:
		B();
};
*/
#include <iostream>
#include "Inheritance.h"
using namespace std;
	A::A(){
		cout<< "A()" <<endl;
	}
	
	B::B(){
		cout<< "B()" <<endl;
	}