//ignore this file
#include <iostream>
using namespace std;

	char nextChar(const char* charArray = 0) {	//default value to zero
	  static const char* s;
	  if(charArray) {
		s = charArray; cout<<"yeah"<<endl;
		return *(s++);
	  }else{
	  }
	  return *s++;
    }
	
int main(){
	char array[4] = {'c', 'h', 'a', 'r'}; 	//{'c', 'h', 'a', 'r'} = {[0][1][2][3]}
	cout<< "\n printing array contents one char at a time through function nextChar\n" << endl;
	for(int i = 0; i < 4; i++){
		cout<< "\t" << "array[i]" << array[i];
		char c = nextChar( array );
		cout<< "\t" << c << endl;
	}
	
	
	
	
	
}