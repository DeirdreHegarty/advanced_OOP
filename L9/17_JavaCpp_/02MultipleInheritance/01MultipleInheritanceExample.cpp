// Example adapted from:
//  http://stackoverflow.com/questions/9359948/multiple-inheritance-whats-a-good-example
//
//	An example of C++ Multiple Inheritance showing polymorphism.
#include <iostream>
using namespace std;
//declarations
class Animal {
 public:
  virtual void eat();
};

class Mammal : public Animal {
 public:
  virtual void breathe();
};

class WingedAnimal : public Animal {
 public:
  virtual void flap();
};

// A bat is a winged mammal
class Bat : public Mammal, public WingedAnimal {
	public:
		void eat();
		void breathe();
		void flap();
};
void makeFlap(WingedAnimal&);		//define a 'WingedAnimal&' param function
//definitions
void Animal::eat(){ 		cout << "Animal::eat()" 		<< endl; }
void Mammal::breathe(){		cout << "Mammal::breathe()" 	<< endl; }
void WingedAnimal::flap(){	cout << "WingedAnimal::flap()()"<< endl; }
void Bat::eat(){ 			cout<< "Bat::eat()" 			<< endl;}
void Bat::breathe(){ 		cout<< "Bat::breathe()" 		<< endl;}
void Bat::flap() {			cout<< "Bat::flap()" 			<< endl;}

int main(){
	Bat *b = new Bat();
		b-> eat();
		b-> breathe();
		b-> flap();
	Mammal *m = new Bat();
	m->breathe();				//example polymorphism
	((Bat*)m)->flap();			//example downcast
	makeFlap( *b );				// polymorphic function: 'b' :Bat:WingedAnimal
	
}

void makeFlap(WingedAnimal& flappable){
	cout<< "inside makeFlap" << endl;
	flappable.flap();
}