//: C03:PassAddress.cpp
//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)

//Good Task: see if you can convert PassByValue.cpp to the code below on your own.

#include <iostream>
using namespace std;

void f(int* a) {
	cout << "(in f) (*a) is\t" << *a << "\t\t(arg value)" 	<< endl;
	cout << "(in f) a is\t"    <<  a << "\t(pointer value)" << endl;
	*a = 5;
	cout << "(in f) '*a = 5'" << "\t\t\t(assignment)" <<endl;
	cout << "(in f) (*a) is\t" << *a << "\t\t(value changed)" 	 << endl;
}

int main() {
	int x = 47;
	cout << "(in main) x  is\t"  << x  << endl;
	cout << "(in main) &x is "   << &x << endl;
	cout << "\'f(&x);\'" << "\t\t\t(function call)" << endl;
	f(&x);
	cout << "(in main) x is " << x << "\t\t(outside 'x' (pointed-to) has changed)" << endl;
	cout << "(in main) &x  is " << &x << "\t(address of 'x' was passed to f)" << endl;

} ///:~