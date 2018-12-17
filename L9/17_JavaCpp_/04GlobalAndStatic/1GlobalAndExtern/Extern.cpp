//: C03:Forward.cpp
// A second use of 'extern'
// Forward function & data declarations
#include <iostream>
using namespace std;

    extern int i; 			//2nd use of extern...
    extern void func();		// i.e. to notify the compiler that
							//      something is defined later
    int main() {
      i = 0;				// 'i' used here
      func();				// 'func()' used here
    }
    int i; 					// 'i' defined here
    void func() {			// 'func()' defined here
      i++;
      cout << i;
    } ///:~