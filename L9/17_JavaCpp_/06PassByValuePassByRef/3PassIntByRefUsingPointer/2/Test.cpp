//http://pages.cs.wisc.edu/~cs368-2/CppTutorial/ : Section: "Parameter-passing modes" --> "Reference Parameters"
#include <iostream>
using namespace std;

	void f(int *p) {
		*p = 5;
		p  = NULL;
	}

	int main() {
		int x=2;
		int *q = &x;
		
		f(q);

		// here, x == 5, but q != NULL
		cout<< "\tx:\t" << x << "\n\t*q:\t" << q << endl;
	}
