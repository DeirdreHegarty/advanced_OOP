//credit to
// http://stackoverflow.com/questions/6765145/multiple-inheritance-c-and-same-method-signature-in-multiple-super-classes?rq=1
// for this example. Similarly see:
// http://www.parashift.com/c++-faq-lite/mi-diamond.html
// for a useful explanation (which also points out why it's not so "dreaded" or "deadly")
#include <iostream>
using namespace std;
//declarations
class Engineer{
	public:
		virtual void buildRobot();
	protected:
		int intData;
};

class MechanicalEngineer : public Engineer{ 
 public:

};

class ElectronicEngineer : public Engineer{ 
 public:

};

class RoboticEngineer : public MechanicalEngineer, public ElectronicEngineer{
	public:
		RoboticEngineer(){ /*intData = 0;*/ }		//**HERE also: 'intData' is ambiguous
};								

//definitions
void Engineer::buildRobot(){	cout<< "Engineer buildRobot()" 	<< endl; }


int main(){
	RoboticEngineer *r = new RoboticEngineer();
	r -> buildRobot();								//**HERE
	
	Engineer *e = r;								//**HERE also
	//Note: 
	// You could try a static cast as a solution but it's not really advised
	//  See the use of virtual in the next example, but here it is just to try:
	//Engineer *e = static_cast<MechanicalEngineer*>(r); 			

}
/*
	Above, even though there is only one implementation the compiler gets
	confused! You see, the RoboticEngineer Object will have a copy of a 
	MechanicalEngineer & an ElectronicEngineer object inside of it; 
	as such, each internal object will have a 'buildRobot()' function 
	and an 'intData' member.
	Which one does the programmer want?
*/

