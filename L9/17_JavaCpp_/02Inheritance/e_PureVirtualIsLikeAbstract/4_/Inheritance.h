class A
{
	public:
		A();		
		virtual void doX() = 0;		//"pure virtual" or 'abstract'
};							    

class B : public A
{
	public:
		B();
		void doX();			 
};							