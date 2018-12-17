//[FooBar.h] 
class Bar{
	public:
		virtual ~Bar();
		void doBarThing();
};
class Foo               	
{
	Bar *aBar;		
	
	public:                 
		Foo();				//creation now in the Constructor	
		virtual ~Foo();		//deletion now in the Destructor
		//void createBar();
		void useBar();
		//void deleteBar();
	          
};