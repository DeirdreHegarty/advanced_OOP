//test.cpp
#include <iostream>
#include "FooBar.h"			
using namespace std;

void sadErrorPronePath(){
	Foo f;				
	f.useBar();
	f.createBar();
	f.createBar();	//2nd call, causes 1 Object to be 'leaked'
	
	//Note also:
	// If you call useBar() before createBar(): think what happens
	// If you forget to call deleteBar(): think what happens
	// Bottom-Line: this should be done in constructor & destructor
}
int main(){
	sadErrorPronePath();

}

