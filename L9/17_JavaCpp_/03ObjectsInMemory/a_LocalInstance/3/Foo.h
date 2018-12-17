//[Foo.h] 
class Foo               	
{
	public:                 
		int a;       
						// No default constructor: 		Foo()
		Foo(int anA);	// BUT, an arg'd constructor: 	Foo(:int)
		virtual ~Foo();				
		void doX();			
	          
};