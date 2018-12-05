/**
 *	This work by Rob Cleary is licensed under a Creative Commons Attribution-ShareAlike 3.0 Unported License. 
 *	Based on a work at www.usethetools.net. Permissions beyond the scope of this license may be available via 
 *	usethetoolsinstructor1@gmail.com
 *//*
 * Here we add inheritance, and consider what effect
 * the "exception specification" (i.e. the "...throws AngryDogException" clause)
 * has on sub-classes wishing to override a super-class method.
 * TASK:
 * 		1. The code doesn't compile... 
				examine it, and state the changes you had to make to fix it.
 * 		2. Run it a few times... from a User's point of view, is the 
				Exception "handled" appropriately?
 */
import java.util.Random;
class Dog{
	static final String[] dogLocations = {"head","under chin", "back", "sensitive-place"};
	
	void acceptPetting(String location) throws AngryDogException, HappyEndingException{
		if( location.equals("sensitive-place") ){ 		//if you pet the dog on a sensitive-place
			if( Math.random() > .5 )					// 50% of the time you get an angry dog!
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
		if( location.equals("sensitive-place") ){       //if you pet the dog on a sensitive-place
			if( Math.random() < .2 )					// 80% of the time you get an angry dog!
			{	
				throw new AngryDogException();
			}else {
				throw new HappyEndingException();		//some dogs might like this?
			}
		}else{
			System.out.println("Pet Dog's "+location+"... Dog is Happy With Petting");
		}
	}
}
class AngryDogException extends Exception{
	public String getMessage(){
		return "sensitive petting location";
	}
}
class HappyEndingException extends Exception{}


class DogPetter
{	
	Random rand = new Random(); //use to generate random index inside Dog.dogLocations.length
	
	void petDogRandomly(Dog aDog){
		int randomIndex = rand.nextInt(Dog.dogLocations.length);
		String aPlace = Dog.dogLocations[ randomIndex ];
		try{
			aDog.acceptPetting( aPlace );	
		}catch(AngryDogException ade){
			ade.printStackTrace();				//NEVER write an empty catch block
		}catch(HappyEndingException hee){
			hee.printStackTrace();				//NEVER write an empty catch block
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








