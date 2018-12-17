#include <iostream>
using namespace std;

int main(){
	
	int** twoDArray = new int*[4];
	
	for(int i = 0; i < 4; i++){
		twoDArray[i] = new int[4];
	}
	
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			twoDArray[i][j] = i * j;
			cout<< twoDArray[i][j];
		}
		cout << endl;
	}
		
	
}