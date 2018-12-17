//credit to
// http://stackoverflow.com/questions/6765145/multiple-inheritance-c-and-same-method-signature-in-multiple-super-classes?rq=1
// for this example. See the above link also, for a very clean explanation of the issue highlighted here.
#include <iostream>
using namespace std;
//declarations
class MechanicalEngineer{ 
 public:
	virtual void buildRobot();					
};

class ElectronicEngineer{ 
 public:
	virtual void buildRobot();					
};
/*Ok, now, the RoboticEngineer defines it's own buildRobot, so the compiler
	can tell (knows) that a call to RoboticEngineer::buildRobot() should go 
	to that function - there is no ambiguity*/
class RoboticEngineer : public MechanicalEngineer, public ElectronicEngineer{
	public:
	virtual void buildRobot();  // now a buildRobot() function is declared
};								// i.e. declares that RoboticEngineer will have 
								// 		a buildRobot() implementation
//definitions
void MechanicalEngineer::buildRobot(){	cout<< "Mechanical buildRobot()" 	<< endl; }
void ElectronicEngineer::buildRobot(){	cout<< "Electronic buildRobot()"	<< endl; }

//Here - no ambiguity - we have defined a RoboticEngineer::buildRobot()
void RoboticEngineer::buildRobot(){	
	cout<< "RoboticEngineer::buildRobot()" << endl;
	//ElectronicEngineer::buildRobot();	//	we have implemented the RoboticEngineer
										//  & can explicitly stipulate which base class
										//	it should inherit from if we want to.
}

int main(){
	RoboticEngineer *r = new RoboticEngineer();
	r -> buildRobot();								//**HERE
}


