/*
//[Foo.h] 
class Foo               	// declare a class Foo
{
	public:                 // begin the public section
		Foo();              // declare a constructor for Foo
		void doX();
	protected:              // begin the protected section
		int m_num;          // declare an instance variable of type int
};
*/
//[Foo.cpp] 
#include <iostream>
#include "Foo.h"
using namespace std;
	Foo::Foo()              	// definition for Foo's constructor
	{
		m_num = 5;           	// the constructor initializes the _num
								// instance variable
	}
	void Foo::doX(){
		cout<<"Change: Foo2.cpp's doX() running now"<<endl; 
	}