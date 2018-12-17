//: C03:YourPets1.cpp
//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)

#include <iostream>
using namespace std;

int global_i, global_j, global_k;				// global variables

void function(int anInt) {						// a function
  cout << "anInt is: " << anInt << endl;
}

int main() {
  int i, j, k;									// local variables
  int numArray[] = { 1, 2, 3, 4};
  cout<<"&function() \t:" <<  (long) &function << endl;
  cout<<"&global_i \t:" << (long) &global_i << endl;
  cout<<"&global_j \t:" << (long) &global_j << endl;
  cout<<"&global_k \t:" << (long) &global_k << endl;
  cout<<"&i \t:" << (long) &i << endl;
  cout<<"&j \t:" << (long) &j << endl;
  cout<<"&k \t:" << (long) &k << endl;
  cout<<"&numArray[0] \t:" << (long) &numArray[0] << endl;
  cout<<"&numArray[1] \t:" << (long) &numArray[1] << endl;
  cout<<"&numArray[2] \t:" << (long) &numArray[2] << endl;
  cout<<"&numArray[3] \t:" << (long) &numArray[3] << endl;
  
} ///:~