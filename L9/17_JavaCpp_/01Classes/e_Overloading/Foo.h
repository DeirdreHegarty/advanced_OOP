//[Foo.h] 
#include <stdio.h>			//printf is in <stdio.h>
class Foo               	
{
	public:                 
		Foo();              
		void doX();	
		//overloading print function on type int/double
		void print( int x )		{ printf("print(int):\t x = %d\n",x); }			//inlining
		void print( double x )	{ printf("print(double):\t x = %lf\n",x); }		//inlining
	protected:              
		int a;          
};