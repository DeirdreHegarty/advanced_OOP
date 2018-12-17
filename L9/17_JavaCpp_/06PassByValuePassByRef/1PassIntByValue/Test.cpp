//Test.cpp
#include <iostream>
#include "Person.h"
using namespace std;

   void makeOneYearOlder(int intPassedIn)		//Parameter is declared "by value"
   {											// ... so it's passed by value
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

   
