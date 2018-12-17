class A
{
	public:
		A();
		void doX();
};

class B : public A		//class B inherits from class A
{
	public:
		B();
		void doX();		//the intent here, is to override the doX() function
};