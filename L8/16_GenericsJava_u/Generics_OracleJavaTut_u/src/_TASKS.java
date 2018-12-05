// /**
// TASK01: Suppose you have pre-Java5.0 code such as:
// class Box{
// 	Object o;
// 	Object get(int index){
// 		return o;
// }
// Outline 2 advantages to a client-programmer, if converting
// the code to use generics. Give brief demo-code (compilable).
// //*/
// /*
//  * TASK01 explanation
//  */
// //TASK01 Code
// No casting and is homogeneous


// /**
// TASK02: Continuing from Box code above, suppose you also have
// class Num{...}
// class SmallNum extends Num{}

// You want to have a method to accept a Box with either a 
// Num or SmallNum type object inside -
// e.g.
// static void boxTest( ... boxToTest){
// }
// //*/
// /*
//  * TASK02 explanation
//  */
// //TASK02 Code

// /**
// TASK03: Give an example of a generic method
// with an upper-bounded Type parameter AND
// compare it to the same only using a wild-card
// //*/
// /*
//  * TASK03 explanation
//  */
// //TASK03 Code


// /**
// TASK04: Give an example of a generic method
// with an lower-bounded Type parameter AND
// compare it to the same only using a wild-card
// //*/
// /*
//  * TASK04 explanation
//  */
// //TASK04 Code

// <? super Num> mean cannot go lower that 'extends smallNum'
// < U extends Num>

// /**
// TASK05: Briefly summarise the Oracle Java Tutorial
// guidelines for using wild-cards. State and explain
// 'In' and 'Out' type parameters and give examples.
// //*/
// /*
//  * TASK04 explanation
//  */
// //TASK04 Code