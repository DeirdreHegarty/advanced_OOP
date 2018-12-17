//Test.cpp
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	cout<<"A* a = new B(); causes..."<<endl; //Abstract base-class A ptr to B-type Object
	A *a = new B();			
	cout<<"a->doX() now works"<<endl;
	a->doX();			
}
