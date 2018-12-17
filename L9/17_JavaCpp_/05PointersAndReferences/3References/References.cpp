//References.cpp
#include <iostream>
#include <stdio.h>		//printf
using namespace std;

int main(){
	int number = 0;
	
	//int& ref;				//	Note: try declaring 'ref'
	//ref = number;			// 		without assigning - gives Error!
	
	int& ref = number;				// A Reference
	const int& constRef = number;	// A const reference (like Java 'final')
	
	printf("number value: \t%d\n", number);
	printf("ref value: \t%d\n", ref);
	
	cout<< "number++;" << endl;
	number++;

	printf("number value: \t%d\n", number);
	printf("ref value: \t%d\n", ref);
	
	int number2 = 10;
	ref = number2;
	//constRef = number2;			// const reference is not assignable
	printf("\tnumber value: \t%d\n", number);
	printf("\tref value: \t%d\n", ref);
	
	
}