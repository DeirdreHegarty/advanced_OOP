// **************************************************************
// TASK01: Suppose you have pre-Java5.0 code such as:
// class Box{
// 	Object o;
// 	Object get(int index){
// 		return o;
// }
// Outline 2 advantages to a client-programmer, if converting
// the code to use generics. Give brief demo-code (compilable).
//
	// negative affect of object:
    // * need to cast
    // * If want list of specific type - no way of checking if all types are same
    // * not type safe (could pass wrong type)
	// 
	// advantages:
	// * No casting needed
	// * it is homogeneous
	// * it is type-safe

// **************************************************************
// TASK02: Continuing from Box code above, suppose you also have
// class Num{...}
// class SmallNum extends Num{}

// You want to have a method to accept a Box with either a 
// Num or SmallNum type object inside -
// e.g.
// static void boxTest( ... boxToTest){
// }
// 

// **************************************************************
// TASK03: Give an example of a generic method
// with an upper-bounded Type parameter AND
// compare it to the same only using a wild-card
// 


// **************************************************************
// TASK04: Give an example of a generic method
// with an lower-bounded Type parameter AND
// compare it to the same only using a wild-card
// 

// <? super Num> mean cannot go lower that 'extends smallNum'
// < U extends Num>

// **************************************************************
// TASK05: Briefly summarise the Oracle Java Tutorial
// guidelines for using wild-cards. State and explain
// 'In' and 'Out' type parameters and give examples.
//
// 
// 
// 
// 
// 
// 
// 