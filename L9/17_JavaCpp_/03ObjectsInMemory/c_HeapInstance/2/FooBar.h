//[FooBar.h] 
class Bar{
	public:
		void doBarThing();
};
class Foo               	
{
	Bar *aBar;		
	
	public:                 
		Foo();
		virtual ~Foo();				
		void createBar();
		void useBar();
		void deleteBar();
	          
};