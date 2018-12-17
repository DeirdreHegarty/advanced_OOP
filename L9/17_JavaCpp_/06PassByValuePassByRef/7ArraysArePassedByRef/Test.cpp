//http://pages.cs.wisc.edu/~cs368-2/CppTutorial/ : Section: "Parameter-passing modes" --> "Array Parameters"
#include <iostream>
using namespace std;

	void f(int array[]) {			//Declaration looks like pass by value (copy)
		array[0] = 5;
	}
		
	int main() {
		int b[10];
		b[0] = 2;
		
		f(b);					// BUT! Arrays are always passed by Ref in C++
		cout << b[0] << endl;   // ...the output is 5
	}
