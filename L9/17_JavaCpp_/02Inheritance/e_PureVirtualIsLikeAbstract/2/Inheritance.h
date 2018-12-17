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
		//void doX();			//COMPILE ERROR! 
};								// Inheriting from abstract class A
								// requires providing an implementation for abstract
								// function 'doX();'
