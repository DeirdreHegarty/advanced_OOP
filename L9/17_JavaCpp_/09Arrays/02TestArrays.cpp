#include <iostream>
using namespace std;

int main(){
	int array[4] = {1, 2, 3, 4}; 	//{1, 2, 3, 4} = {[0][1][2][3]}
	cout<< "\n printing array contents \n" << endl;
	for(int i = 0; i < 4; i++){
		cout<< "array[i]" << "\t" << array[i] << endl;
	}
	
	cout<< "(*array)"   << "\t" << *(array) << endl;
	cout<< "(*array +1)" << "\t" << *(array +1) << endl;
	cout<< "(*array +2)" << "\t" << *(array +2) << endl;
	cout<< "(*array +3)" << "\t" << *(array +3) << endl;
	
	cout<< "(As an array in C++ is only referrable by a <type> pointer)" << endl;
	cout<< "(...you can add to the pointer value to get the next index)" << endl;
	
	//try this and execute
	cout<< "*(array +14)" << "\t" << *(array+14) << endl;
	
}