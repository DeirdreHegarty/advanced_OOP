//Test.cpp
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	
	A *a = new A();		//compile-error: class A is now abstract
	a->doX();			
}
