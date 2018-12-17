//: C03:YourPets1.cpp
//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter03.html (http://www.mindviewinc.com/Books/downloads.html)

#include <iostream>
using namespace std;

int main() {
	int i = 4;
	int* iptr = &i;								//int* means "int pointer"
												//&    means "address of"
	cout<< "cout<< i \t:" 	  << i 	 <<endl;
	cout<< "cout<< &i \t:" 	  << &i	 <<endl;
	cout<< "cout<< iptr \t:"  << iptr  <<endl;
	cout<< "cout<< *iptr \t:" << *iptr <<endl;

	cout<< "*iptr = 5;" <<endl;
	*iptr = 5;
	cout<< "cout<< i \t:" 	<< i 	 << endl;
	cout<< "(otherwise no change)"   << endl;
	cout<< "cout<< &i \t:" 	<< &i 	 << endl;
	cout<< "cout<< iptr \t:"  << iptr  << endl;
	cout<< "cout<< *iptr \t:" << *iptr << endl;

	cout<< endl <<"(note: using \'*iptr\' somewhat like"<<endl;
	cout<< "\t\'iptr.follow().getValueInside()\'"<<endl; 
	cout<< "\tbehind the scenes )"<<endl;
	cout<< "\nNote above how: 'iptr\' is equivalent to \'&i\'"<<endl;
	cout<< "Question: if equivalent, what's \'&\' need for?"<<endl;
	  
  
} ///:~