//: C03:FileStatic.cpp
// File scope demonstration. Compiling and 
// linking this file with FileStatic2.cpp
// will cause a linker error
#include <iostream>
using namespace std;
    // File scope means only available in this file:
    static int fs; 			//'fs' not available outside

	static void func(){
		cout<< "func(): fs = " << fs << endl;
	}	//'func()' not available outside
	
    int main() {
      fs = 1;
	  func();
    } ///:~