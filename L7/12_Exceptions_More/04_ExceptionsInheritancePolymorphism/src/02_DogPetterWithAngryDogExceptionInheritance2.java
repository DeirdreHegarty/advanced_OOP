/**
 *	This work by Rob Cleary is licensed under a Creative Commons Attribution-ShareAlike 3.0 Unported License. 
 *	Based on a work at www.usethetools.net. Permissions beyond the scope of this license may be available via 
 *	usethetoolsinstructor1@gmail.com
 */
 /*
 * Here we consider if there is a way to "re-use" the 
 * conditional code from the Dog.acceptPetting() method
 * in the sub-class AngryDog.acceptPetting()
 *
 * TASK: 1) Feel free to declare an instance variable if you wish, but 
			re-write the class to re-use the superclass implementation.
			(submit the code-changes)
		 2) Analyse the super-class Exception specification	- considering there may be
			many more kinds of animal behaviour that could result from petting a dog, 
			how might you improve the design of the DogExceptions below, to make the 
			code more "extensible" and resistant to change (robust).
			
 */
import java.util.Random;
class Dog{
	static final String[] dogLocations = {"head","under chin", "back", "sensitive-place"};
	
	void acceptPetting(String location) throws AngryDogException, HappyEndingException{
		if( location.equals("sensitive-place") ){ //if you pet the dog on a sensitive-place
			if( Math.random() > .2 )
			{	
				throw new AngryDogException(); //he might take Exception to it!
			}
		}else{
			System.out.println("Pet Dog's "+location+"... Dog is Happy With Petting");
		}
	}
}
class AngryDog extends Dog{
	void acceptPetting(String location) throws AngryDogException, HappyEndingException{
		//Our sub-class implementation is a repeat of the super-class method's code, only with an added
		// else block... 
		//TASK: How could you re-use the super-class implementation?
		/* 
		if( location.equals("sensitive-place") ){ 
			if( Math.random() < .5 )
			{	
				throw new AngryDogException();
			}else {
				throw new HappyEndingException();
			}
		}else{
			System.out.println("Pet Dog's "+location+"... Dog is Happy With Petting");
		}*/
	}
}
class AngryDogException extends Exception{
	public String getMessage(){
		return "sensitive petting location";
	}
}
class HappyEndingException extends Exception{
	public String getMessage(){
		return "who's a happy dog there?";
	}
}


class DogPetter
{	
	Random rand = new Random(); //use to generate random index inside Dog.dogLocations.length
	
	void petDogRandomly(Dog aDog){
		int randomIndex = rand.nextInt(Dog.dogLocations.length);
		String aPlace = Dog.dogLocations[ randomIndex ];
		try{
			aDog.acceptPetting( aPlace );	
		}catch(AngryDogException ade){
			ade.printStackTrace();	//NEVER write an empty catch block
		}catch(HappyEndingException hee){
			hee.printStackTrace();
		}
	}
} 
class TestDogPetter
{
	public static void main(String[] args)	{
		DogPetter aDogPetter = new DogPetter();
		Dog[] dogs = { new Dog(), new AngryDog(), new AngryDog()};
		for(int i = 0; i < dogs.length; i++)
		{ 		 
			System.out.println("Dog "+ i);
			aDogPetter.petDogRandomly( dogs[i] );
		}
	}
}








