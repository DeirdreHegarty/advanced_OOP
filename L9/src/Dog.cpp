#include "Dog.h"
#include <iostream>
#include <string>

Dog::Dog(std::string aName) : cuteness(0), isFluffy(true), name()
{
	name = aName;
	std::cout << "Dog::Dog() constructor for " << aName << "\n";
}
Dog::~Dog(){
	std::cout << "DESTRUCT!!" << "\n";

}
// copy constructor
Dog::Dog(const Dog *dref){ 				// expects a pointer as argument
	std::cout << "Dog::Dog() copy constructor: " << dref << "\n";
	cuteness = dref->cuteness;
	isFluffy = dref->isFluffy;
	name = dref->name;
}
// assignment operator
// does NOT get called by main if '*doper' instead of '&doper'
// needs to be reference to a Dog NOT a pointer 
Dog& Dog::operator = (const Dog &doper){ 
	std::cout << "Dog::Dog() operator" << "\n";
	return *this;
}
void Dog::setName(std::string aName){
	name = aName;
}
std::string Dog::getName(){
	return name;
}
void Dog::setCuteness(int cute){
	cuteness = cute;
}
int Dog::getCuteness(){
	return cuteness;
}