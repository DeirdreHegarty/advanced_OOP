//: C03:Static.cpp
// Using a static variable in a function
#include <iostream>
using namespace std;

    void func() {
      static int i = 0;					//A "local static" variable in C++
	  //int i = 0;						// compare output when non static local variable
      cout << "i = " << ++i << endl;
    }

    int main() {
      for(int x = 0; x < 10; x++)
        func();
    } ///:~/*
	
/*
Bruce Eckel (c) 2000: Thinking in C++, 2nd ed' Volume 1, 
	Chapter03: "The C in C++", Section: "Specifying storage allocation" -->"static"
"
The static keyword has several distinct meanings. Normally, variables defined local to 
a function disappear at the end of the function scope. When you call the function again, 
storage for the variables is created anew and the values are re-initialized. If you want 
a value to be extant throughout the life of a program, you can define a function’s local 
variable to be static and give it an initial value. The initialization is performed only 
the first time the function is called, and the data retains its value between function 
calls. This way, a function can “remember” some piece of information between function calls.
"
*/
/*
See also: Thinking in C, Free online Multimedia course, Bruce Eckel & Chuck Elison
Chapter06, {sections: "Static Variables", "Example"}
*/