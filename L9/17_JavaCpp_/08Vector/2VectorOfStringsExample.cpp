//: C02:Intvector.cpp
// Creating a vector that holds integers
#include <iostream>
#include <vector>
#include <string>
using namespace std;

	int main() {
	  vector<string> v;
	  v.push_back("bah");
	  v.push_back("bah");
	  v.push_back("black");
	  v.push_back("sheep");
	  
	  for(int i = 0; i < v.size(); i++)
		cout << v[i] << ", ";
	  cout << endl;
	  
	} ///:~