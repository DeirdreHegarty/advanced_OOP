//adapted from: ThinkingInCPP_2ed_V1/htmlBook/Chapter11.html (http://www.mindviewinc.com/Books/downloads.html)
//: C11:HowMany.cpp
// A class that counts its objects.
// This is a deep example and requires deep study of the output and tracing 
// of the code-statements in order to learn from it.
#include <iostream>
#include <string>
using namespace std;

class AnObject {
	public:
		static int objectCount;				//static objectCount member keeps track
		string objectTag;					// ...of the number of created objects
		/*Constructor*/
		AnObject(const string& anObjectId){ 	//Sets objectTag to be "x_orig", ++'s the objectCount, and printSelf
			objectTag = anObjectId+"_orig";		//add constructed tag: "orig" to the objectTag passed-in
			++objectCount; 						//increment object count
			printSelf("Constructed: AnObject(:string)");
		}
		/*Destructor*/
		~AnObject() {
			printSelf("~AnObject(): "+objectTag);
			objectCount--;			//decrement object count
		}
		/*Copy Constructor*/
		AnObject(const AnObject& objectRef){
			objectTag = objectRef.objectTag;			//change copy-constructed obj tag
			replaceObjectTag("orig", "copy");		//replace "orig" with "copy"
			++objectCount;							//increment object count
		}
	  
		void printSelf(const string& printMsg = "") {
			cout << printMsg << ":\t"
				 << objectTag 	<< " (objects = "
				 << objectCount << "): " << endl;
		}
		
		//finds string in objectTag "orig" and replaces with "copy" 
		void replaceObjectTag(const string& oldTag, const string& newTag){
			size_t index;							//size_t effectively means int (positive-only)
			index = objectTag.find(oldTag, 0);		//index set to position of oldTag
			if (index == string::npos) return;
			objectTag.replace( index, newTag.length(), newTag);	//replace at that index, for 4 chars newTag("copy")
		}
};

int AnObject::objectCount = 0;

// Pass and return BY VALUE:
AnObject f(AnObject x) {
  x.printSelf("in f(:AnObject) ");		//See output: x is now a copy
  return x;								//return BY VALUE causes copy-constructor to be invoked
}

int main() {
  AnObject o1("a");			//create an object with tag "a"
  o1.printSelf("\n\t before statement: 'AnObject o2 = f(o1);'");
  AnObject o2 = f(o1);		//copy-assignment operator
  o2.printSelf("\n\t after 'AnObject o2 = f(o1);'");
} ///:~