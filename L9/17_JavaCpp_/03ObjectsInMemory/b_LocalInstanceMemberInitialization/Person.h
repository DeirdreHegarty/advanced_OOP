//[Person.h] 
class Wallet
{
	public:
		int money;
		Wallet(int anAmount);
};

class Person               	
{
	public:                 
		Wallet wallet;     	//Note: to use the symbol 'Wallet' as a type  
							// it needs to be declared before this point
		Person();			// i.e. try moving the declaration for 'class Wallet'
		void spend();		//      below the declaration for 'class Person'	
	          
};

