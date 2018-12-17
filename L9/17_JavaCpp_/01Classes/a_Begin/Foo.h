//[Foo.h] 
// This "header" file is like a description of a class
// that will be defined in a corresponding  ".cpp" file of the same name

class Foo               	// declare a class Foo
{
	public:                 // begin the public section
		Foo();              // declare a constructor for Foo
		void doX();			// declare a function 'doX():void'
	protected:              // begin the protected section
		int m_num;          // declare an instance variable of type int
};
//http://cs.brown.edu/courses/cs123/docs/java_to_cpp.shtml#Introduction
//"
// It's crucial that you remember the semicolon at the end of a C++ class declaration.
// Failure to include the semicolon will cause a compile-time error, but not at the end
// of the class declaration. Often the error will be reported in a perfectly viable file, 
// such as in a header file that you included.
//"
