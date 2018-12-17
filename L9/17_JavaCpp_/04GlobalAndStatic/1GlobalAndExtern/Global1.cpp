//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)
    //: C03:Global.cpp
    //{L} Global2
    // Demonstration of global variables
    #include <iostream>
    using namespace std;

    int globe;					//a global variable
	
    void func();
	
    int main() {
      globe = 12;
      cout << globe << endl;
      func(); // Modifies globe
      cout << globe << endl;
    } ///:~