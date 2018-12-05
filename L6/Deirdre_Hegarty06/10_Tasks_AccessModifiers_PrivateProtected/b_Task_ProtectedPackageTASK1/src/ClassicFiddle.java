package classic;
import plain.PlainFiddle;

class ClassicFiddle extends PlainFiddle{
	void playSweetly(){

		play(); //works! Accessing play() through inheritance

		System.out.println("playSweetly():\t & plays sweetly");
		
		// TASK:
		/********* 2.1 *************/
		PlainFiddle pf = new PlainFiddle(); 
		/* DOES THIS WORK?
		* Yes, because the constructor for PlainFiddle() is
		* protected access it can be inhertied. This means the
		* constructor can be acces from outside the `plain` package
		* by ClassicFiddle() which is inside the `classic` package
		*/

		/********* 2.2 *************/
		// pf.play();  
		/*
		*
		* DOES THIS WORK? THINK ABOUT IT!
		* No because:
		* protected access means that you can access play() 
		* either through package access (in the same package),
		* or through inheritance.
		*
		* If it was in the same package it could access play()
		* thorugh ref. 
		* Because play() is not inherited, protected wont work
		* Note play() on its own works (inherited)
		*
		*/
	}
	
}


	