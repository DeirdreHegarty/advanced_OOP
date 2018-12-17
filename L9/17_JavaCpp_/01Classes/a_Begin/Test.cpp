//Test.cpp
#include <iostream>
#include "Foo.h"				//Note: _no_ semi-colon after #include directives
using namespace std;

int main(){
	//Foo f = new Foo();		//attempt Java-style "Foo f = new Foo();" fails
	//f->doX();					// similarly, expecting use of '->' in place of '.' fails
	
	Foo *f = new Foo();
	f->doX();
}