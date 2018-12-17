class A
{
	public:
		A();		
		virtual void doX() = 0;	
};							    

class B : public A
{
	public:
		B();
		void doX();			//function declaration for abstract doX() in A
							//	...declares intent to provide implementation
};							