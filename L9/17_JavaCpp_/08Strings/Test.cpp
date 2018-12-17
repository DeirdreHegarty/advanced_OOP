//Test.cpp
#include <iostream>
#include <string>		//include std::<string>
using namespace std;
 
   int main()
   {  
		string s1; 						// Empty string Object
		string s2 = "s2: text"; 		// Initialize: way 1
		string s3("s3: text"); 			// Initialize: way 2
		s1 = "s1: text";				// Assigning a previously declared
		string s4 = "s4: text"; 		// Assigning & initialize
		
		cout << s1 +"\n"+ s2 + "\n" + s3 + "\n" + s4 << endl;
		
		string s5 = s4 + ", " + s3; 		// string concat (overloaded +)
		cout<< "s5 after s4 + \",\"+ s3:" << "\n\t" << s5 << endl;
		
		s1 += "<appended>"; 			// string append (overloaded +=)
		cout<< "s1 after +=:\t" << "\n\t" << s1 << endl;
   }

   
