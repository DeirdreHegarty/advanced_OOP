#include <iostream>
using namespace std;

int main(){
	int array[4]; 	//a local array
	cout<< "array: " << (long)&array << endl;
	cout<< "array[0]: " << (long)&array[0] << endl;
	cout<< "\n printing array contents \n" << endl;
	for(int i = 0; i < 4; i++){
		cout<< array[i] <<endl;
	}
	int* heapArray = new int[4];		//to create an array on the heap, we need an 'int *'
	cout<< endl;						// ...which refers to the 1st memory slot of the array
	cout<< "heapArray: " << (long)&heapArray << endl;
	cout<< "heapArray[0]: " << (long)&heapArray[0] << endl;
	
}