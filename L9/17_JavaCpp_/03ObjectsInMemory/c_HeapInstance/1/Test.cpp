//test.cpp
#include <iostream>
#include "FooBar.h"			
using namespace std;

// if user-programmer's remember the 
//  {create, use, delete}... sequence all will be fine
void happyPath(){
	Foo f;				
	f.createBar();			
	f.useBar();
	f.deleteBar();
	//Note: Foo::~Foo() destructor will run
	// 		when f goes out of scope
}
int main(){
	happyPath();
}

