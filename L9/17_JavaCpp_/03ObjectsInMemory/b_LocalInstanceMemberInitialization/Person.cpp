//[Person.cpp] 
#include <iostream>
#include "Person.h"
using namespace std;
		
	Person::Person() : wallet(100) {	//Person.wallet is initialised as a non-Heap Object
		cout<< "Person()" <<endl;		//i.e. you would need to replace the ' : wallet(100)'
	}									//		with an constructor statement ' wallet = new Wallet(100)'
										//      to make a Heap Object
	void Person::spend(){
		wallet.money -= 10;
		cout<< "spend(): wallet now " << wallet.money << endl;
	}
	
	Wallet::Wallet(int anAmount)  {
		money = anAmount;
		cout<<"Wallet(:int)"<<endl; 
	}