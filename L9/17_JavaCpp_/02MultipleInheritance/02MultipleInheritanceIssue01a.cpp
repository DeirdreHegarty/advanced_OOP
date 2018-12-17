//credit to
// http://stackoverflow.com/questions/6765145/multiple-inheritance-c-and-same-method-signature-in-multiple-super-classes?rq=1
// for this example. See the above link also, for a very clean explanation of the issue highlighted here.
// Comment the line marked **HERE ( 'r -> buildRobot();') and see that it compiles and executes ok!

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

class RoboticEngineer : public MechanicalEngineer, public ElectronicEngineer{
	public:
	// no buildRobot() function - expecting to get this through inheritance
	//		... but which one should be inherited?
};

//definitions
void MechanicalEngineer::buildRobot(){	cout<< "Mechanical buildRobot()" 	<< endl; }
void ElectronicEngineer::buildRobot(){	cout<< "Electronic buildRobot()"	<< endl; }

int main(){
	RoboticEngineer *r = new RoboticEngineer();
	//r -> buildRobot();								//**HERE
}


