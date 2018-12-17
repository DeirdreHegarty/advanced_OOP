//test.cpp
#include <iostream>		
#include "Foo.h"			//note _no_ semi-colon after #include directives
using namespace std;

int main(){
	//Foo *f = new Foo();
	//f->doX();
	//*Also, try:
	 Foo *f = new Foo;		//defaults to the no-arg constructor
	 f->doX();
	 //*/
}