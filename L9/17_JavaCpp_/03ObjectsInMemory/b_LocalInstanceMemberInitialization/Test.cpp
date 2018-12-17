/*[Test.cpp]
 */
#include <iostream>
#include "Person.h"			
using namespace std;

int main(){
	
	Person bob;
	cout << "bob.wallet.money: " << bob.wallet.money << endl;
	cout << "bob.spend()" << endl;
	bob.spend();
	
}