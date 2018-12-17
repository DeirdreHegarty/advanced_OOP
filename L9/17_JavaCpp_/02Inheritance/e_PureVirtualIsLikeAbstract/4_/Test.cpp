//Test.cpp
/*
 *  In Java, you can write a concrete method in an abstract class
 *		abstract class A{
 *			void doX(){...} //concrete method
 *		}
 *  ...and re-use that code, with a call to 'super.' in the derived class.
 * 		class B extends A{					//method override 
 *			void doX(){ super.doX(); ...}   //re-use with super.doX()
 *      }
 *	In C++ there's no 'super' keyword, as multiple-inheritance is allowed.
 *	In the C++ equivalent of Java, you
 *	(1) declare it pure virtual (virtual <rtrn> fn(...) =0;)
 *	(2) provide a base-class definition A::doX(){...}
 *  (3) in the derived-class definition, call the base-class version
 *				 B::doX(){
 * 					A::doX(); //re-use with A::doX()
 *	See the .h/.cpp, and the output generated.
 */
#include <iostream>
#include "Inheritance.h"			
using namespace std;

int main(){
	cout<<"A* a = new B(); causes..."<<endl; //Abstract base-class A ptr to B-type Object
	A *a = new B();			
	cout<<"a->doX() now causes"<<endl;
	a->doX();			
}
