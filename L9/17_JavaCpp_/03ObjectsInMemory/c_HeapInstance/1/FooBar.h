//[FooBar.h] 
class Bar{
	public:
		void doBarThing();
};
class Foo               	
{					//The default-access specifier is private in C++
	Bar *aBar;		//hence 'aBar' pointer is private
	public:                 
		virtual ~Foo();				
		void createBar();
		void useBar();
		void deleteBar();	          
};