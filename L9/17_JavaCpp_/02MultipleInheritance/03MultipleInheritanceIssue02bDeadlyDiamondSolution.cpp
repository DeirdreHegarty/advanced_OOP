//credit to
// http://stackoverflow.com/questions/6765145/multiple-inheritance-c-and-same-method-signature-in-multiple-super-classes?rq=1
// for this example. Similarly see:
// http://www.parashift.com/c++-faq-lite/virtual-inheritance-where.html
// for a useful explanation of how to prevent the "dreaded" or "deadly" aspect of this issue
#include <iostream>
using namespace std;
//declarations
class Engineer{
	public:
		virtual void buildRobot();
	protected:
		int intData;
};

class MechanicalEngineer : public virtual Engineer{  //**HERE - the inheritance statement is tagged 'virtual' 
 public:

};

class ElectronicEngineer : public virtual Engineer{  //**HERE also
 public:

};												

class RoboticEngineer : public MechanicalEngineer, public ElectronicEngineer{
	public:										//**HERE - this means that only _one_ internal 
		RoboticEngineer(){ intData = 0; }		//			Object is created.
};												//			I.e. one virtual obj' is built from
												//			each of the derived classes
//definitions
void Engineer::buildRobot(){	cout<< "Engineer buildRobot()" 	<< endl; }


int main(){
	RoboticEngineer *r = new RoboticEngineer();
	r -> buildRobot();								//**HERE
	
	Engineer* e = r;								//**HERE also
}


