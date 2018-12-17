//Test.cpp
#include <iostream>
#include "Person.h"
using namespace std;

   void makeOneYearOlder(int& intPassedIn)	//Parameter now declared as a reference (&)
   {										// ... so the int is received as a reference
       intPassedIn += 1;  
   }
   
   int main()
   {  
		Person *p1 = new Person("tim", 14);
		cout<< "tim is: " << p1->age << endl; 
												
		makeOneYearOlder( p1->age );			//pass an int by ---^ 
												//  (see function definition above)

		cout<< "tim is: " << p1->age <<endl;
   }

   
