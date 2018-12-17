
//[Foo.h] 
class Foo               	
{
	public:                 
		Foo();              
		~Foo();				//Now "Foo.h" declares a "Destructor"
		void doX();			
	protected:              
		int i_a, i_b;       
	private:
		double d_a, d_b;
};