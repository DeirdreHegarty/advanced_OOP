//: C02:Scopy.cpp
// Copy one file to another, a line at a time
#include <string>
#include <iostream>
#include <fstream>
using namespace std;

	int main() {
		ifstream in("1BruceEckel_Scopy.cpp"); 	// Open for reading
		//ofstream out("Scopy2.cpp"); 			// Open for writing
		string s;
		while(getline(in, s)) 		// Discards newline char
			cout << s << "\n"; 		// ... must add it back
	} ///:~