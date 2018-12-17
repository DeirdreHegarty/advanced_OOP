// https://www.geeksforgeeks.org/copy-constructor-vs-assignment-operator-in-c/
// https://www.geeksforgeeks.org/copy-constructor-in-cpp/

// TO RUN: g++ -o ../bin/out main.cpp Dog.cpp && ../bin/out 
#include "Dog.h"
#include <iostream>
#include <string>

int main(){
	std::cout << "=================== copy constructor ===================" << std::endl;
	Dog d1("Jessie");
	Dog d2(&d1); 			// pass reference of d1

	Dog d5 = new Dog("Gerry");	// will call copy constructor because dog obj 
						 		// is created and copied into d5

	std::cout << "\t AND EXAMPLE OF * " << std::endl;
	Dog *d4 = new Dog("Bob"); // wont call copy constructor because d4 is a pointer & not a dog obj
	std::cout << (*d4).getName() << std::endl; // dereferencing
	std::cout << d4->getName() << std::endl;   // syntactic sugar for the above dereferencing


	std::cout << "\t AND EXAMPLE OF & " << std::endl;
	Dog *dref = &d5;
	std::cout << &d5 << std::endl;
	std::cout << (*(&d5)).getName() << std::endl;
	std::cout << (*dref).getName() << std::endl;
	std::cout << dref << std::endl;

	std::cout << "=================== assignment operator ===================" << std::endl;
	d1 = d2;				 // assignment operator 

	std::cout << d1.getName() << std::endl;
	d1.setName("Ken");
	std::cout << d1.getName() << std::endl;


	std::cout << d4->getName() << std::endl;
	d4->setName("Johno");
	d4->setCuteness(100);
	std::cout << "My name is: " << d4->getName() << std::endl;
	std::cout << "I have this many cute units: " << d4->getCuteness() << std::endl;

	return 0;
}

// OUTPUT:
// =================== copy constructor ===================
// Dog::Dog() constructor for Jessie
// Dog::Dog() copy constructor: 0x7ffeee773770
// Dog::Dog() constructor for Gerry
// Dog::Dog() copy constructor: 0x7feafd400640
// 	 AND EXAMPLE OF * 
// Dog::Dog() constructor for Bob
// Bob
// Bob
// 	 AND EXAMPLE OF & 
// 0x7ffeee773708
// Gerry
// Gerry
// 0x7ffeee773708
// =================== assignment operator ===================
// Dog::Dog() operator
// Jessie
// Ken
// Bob
// My name is: Johno
// I have this many cute units: 100
// DESTRUCT!!
// DESTRUCT!!
// DESTRUCT!!

// Copy constructor: 
// called when a new object is created from an existing object, 
// as a copy of the existing object.
// example 1 - Dog d5 = new Dog("Gerry");
// example 2 - Dog d2(&d1);

// Assignment operator: 
// called when an already initialized object is assigned a 
// new value from another existing object.
// example d1 = d2;





