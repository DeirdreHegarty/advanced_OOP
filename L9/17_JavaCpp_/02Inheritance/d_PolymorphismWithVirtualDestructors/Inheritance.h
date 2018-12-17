//[Inheritance.h]
class A
{
	public:
		A();
		~A();				
		//virtual ~A();			//Note: the destructor should generally always be virtual!
		virtual void doX();		//	(Try the code with the non-virtual to find-out why?)
};							

class B : public A
{
	public:
		B();
		~B();					//make virtual also for further subclass deletes
		//virtual ~B();
		void doX();		
};

/*
*	http://cs.brown.edu/courses/cs123/docs/java_to_cpp.shtml#Virtual
*  "
*	The destructor should always be declared virtual. The brief explanation 
*	as to why is... say you later go back and derive from a class with a non-virtual 
*	destructor. When that subclass gets destroyed the results are "undefined" according 
*	to Stroustrup. Not all of the memory may end up being released because all of the 
*	destructors won't get called....make sure you always make destructors virtual...
*  "
*/

/* For more thorough explanation:
 * see Thinking in C++, Chapter 15: "Polymorphism and virtual functions", Section: "Destructors and virtual destructors"
 * .../htmlBook/Chapter15.html (http://www.mindviewinc.com/Books/downloads.html)
 */