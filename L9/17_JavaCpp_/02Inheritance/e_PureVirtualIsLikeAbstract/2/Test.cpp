//Test.cpp
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	A *a = new B();		//Read the compiler-error
	a->doX();			
}
