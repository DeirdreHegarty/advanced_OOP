//Test.cpp
#include <iostream>
#include "Person.h"
using namespace std;

   void makeOneYearOlder(Person& aPerson)	//Parameter: passByRef ...
   {
		aPerson.age += 1;					// now, a outside Object changed  
   }
   
   int main()
   {  
		char name[] = "tim";
	
		Person p1(name, 14);				//local object
		cout<< "tim is: " << p1.age << endl; 

		makeOneYearOlder( p1 );				//pass the object by value

		cout<< "tim is: " << p1.age <<endl;
   }

   
