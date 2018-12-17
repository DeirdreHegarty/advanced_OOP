//Test.cpp
#include <iostream>
#include "Person.h"
using namespace std;

   void makeOneYearOlder(Person aPerson)	//Parameter: passByValue ...
   {
		aPerson.age += 1;					// now, a copy being changed  
   }
   
   int main()
   {  
		Person p1("tim", 14);				//local object
		cout<< "tim is: " << p1.age << endl; 

		makeOneYearOlder(  p1 );			//pass the object (a pointer)
											// passByValue determined by the function parameter
		cout<< "tim is: " << p1.age <<endl;
   }

   
