//test.cpp
#include <iostream>
#include "FooBar.h"			
using namespace std;


int main(){
	Foo f;						
	f.useBar();
	
	//Note: Foo::~Foo() destructor will run
	// 		when f goes out of scope
}

