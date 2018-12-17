/*
 * C++ "pure virtual" equates to Java 'abstract'.
 * Achieved by:
 *   virtual <rtrn> <method>(...) = 0;
 * i.e. 
 *		(1)	"virtual" before, 
 *		(2)	"=0;"	  after
 */
class A
{
	public:
		A();		
		virtual void doX() = 0;	//Note: '_virtual_' && '_= 0;_'
};							    //class is abstract now - cannot instantiate 'new A()'
								// (In C++ this is termed a "pure virtual" function)

class B : public A
{
	public:
		B();
		void doX();		
};
