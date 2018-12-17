//Test.cpp
#include <iostream>
#include "Foo.h"			//note _no_ semi-colon after #include directives
using namespace std;

int main(){
	Foo *f = new Foo();
	cout<< "doX(9) called:\tconverts to: doX(9, 5); //'5' default arg-value" <<endl;
	f->doX(9);		  	
	cout<< "a = "<< f->a <<", b = " << f->b <<endl;
}