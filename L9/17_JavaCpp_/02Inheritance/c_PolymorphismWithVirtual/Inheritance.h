class A
{
	public:
		A();				
		virtual void doX();	// Note the '_virtual_ void ...'
};							// (~loosely) this means: "turn on dynamic binding"

class B : public A				
{
	public:
		B();
		void doX();			// Again, the intent is to override
};