//Test.cpp
#include <iostream>
#include "Person.h"
using namespace std;

   void makeOneYearOlder(int* intPassedIn)	//Parameter now declared as an (int*)
   {
       (*intPassedIn) += 1;					//Access the value of the pointer now  
   }
   
   int main()
   {  
		Person *p1 = new Person("tim", 14);
		cout<< "tim is: " << p1->age << endl; 
												
		makeOneYearOlder( &p1->age );			// need to pass & (address-of) now ---^ 
												//  (see function definition above)

		cout<< "tim is: " << p1->age <<endl;
   }

   
