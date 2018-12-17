//: C03:FileStatic2.cpp {O}
// Trying to reference fs
    
	extern int fs;			//try to declare 'fs' as external
	extern void func();		//try to declare 'func()' as external
	
    void blah() {
      fs = 100;
	  //func();
    } ///:~