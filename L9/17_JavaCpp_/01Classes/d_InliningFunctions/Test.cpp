//Test.cpp
#include <iostream>
#include "Colour.h"			//note _no_ semi-colon after #include directives
using namespace std;

int main(){
	Colour *c = new Colour();
	c->setRed(1);				cout<< "c->setRed(1)"<<endl;
	int redVal = c->getRed();	cout<< "c->getRed() returns " << redVal <<endl;
}