//[Foo.h] 
class Foo               	
{
	public:                 
		int a;       
		Foo();			//added constructor 'Foo()'
		Foo(int anA);	//added constructor 'Foo(:int)'
		virtual ~Foo();				
		void doX();			
	          
};
//Note: The constructor 'Foo()' with no-args above
//		is called the "default constructor" in C++