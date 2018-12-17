/*
//Header file declarations reproduced here
// for quick access
//FooBar.h
class Bar{
	public:
		void doBarThing();
};
class Foo               	
{					//The default-access specifier is private in C++
	Bar *aBar;		//hence 'aBar' pointer is private
	public:                 
		virtual ~Foo();				
		void createBar();
		void useBar();
		void deleteBar();	          
};
*/
/*
 * IMPORTANT: This is a lesson in how _NOT_ to write your C++
 *				Object creation/manipulation code.
 */
//[FooBar.cpp] 
#include <iostream>
#include "FooBar.h"
using namespace std;
		
	Foo::~Foo(){											// "Destructor"
		cout<< "Foo() destructor" << endl;
	}	
	//What happens if you call this twice: i.e. there's no 
	// 	garbage-collector in C++
	void Foo::createBar(){
		cout<<"createBar() running"<<endl; 
		aBar = new Bar();				
	}
	
	//What if you call this before calling 'createBar()'?
	// What would 'aBar' be pointing to?
	void Foo::useBar(){
		cout<<"useBar(): calling aBar->doBarThing()"<<endl; 
		aBar->doBarThing();
	}
	
	void Foo::deleteBar(){
		cout<<"deleteBar(): delete aBar"<<endl; 
		delete aBar;
	}
	
	void Bar::doBarThing(){
		cout<<"Bar::doBarThing()"<<endl; 
	}