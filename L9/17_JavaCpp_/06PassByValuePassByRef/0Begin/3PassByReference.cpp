//: C03:PassReference.cpp
//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)

//Good Task: see if you can convert PassByAddress.cpp to the code below on your own.

#include <iostream>
using namespace std;

void f(int& a) {
	cout << "(in f) a is " << a << "\t\t\t(arg value)" 	 << endl;	//was '*a'
	cout << "(in f) &a is "  << &a << "\t\t(address value)" << endl;	//was 'a'
	a = 5;															//was '*a'
	cout << "(in f) 'a = 5'" << "\t\t\t(assignment)" <<endl;
	cout << "(in f) &a is " << &a << endl;
}

int main() {
	int x = 47;
	cout << "(in main) x  is "  << x << endl;
	cout << "(in main) &x  is " << &x << endl;
	cout << "\'f(x);\'" << "\t\t\t\t(function call)" << endl;		//was 'f(&x)'
	f(x);
	cout << "(in main) x is " << x << "\t\t(outside 'x' (referred-to) has changed)" << endl;
	cout << "(in main) &x  is " << &x << "\t('x' was passed to f(int&) )" << endl;

} ///:~