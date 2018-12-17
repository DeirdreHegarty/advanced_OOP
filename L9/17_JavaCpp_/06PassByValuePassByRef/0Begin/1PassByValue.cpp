//: C03:PassByValue.cpp
//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)
#include <iostream>
using namespace std;

void f(int a) {
	cout << "(in f) a is " << a << "\t\t(arg value passed-in)" << endl;
	a = 5;
	cout << "(in f) 'a = 5;'" << "\t\t(assignment)" << endl;
	cout << "(in f) a is " << a << endl;
}

int main() {
	int x = 47;
	cout << "(in main) x is " << x << endl;
	cout << "\'f(x);\'" << "\t\t\t(function call)" << endl;
	f(x);
	cout << "(in main) x is " << x << "\t(outside int unaltered)" << endl;
} ///:~