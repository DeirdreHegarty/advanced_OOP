/**
 *	This work by Rob Cleary is licensed under a Creative Commons Attribution-ShareAlike 3.0 Unported License. 
 *	Based on a work at www.usethetools.net. Permissions beyond the scope of this license may be available via 
 *	usethetoolsinstructor1@gmail.com
 */
/*
 * A light-hearted example highlighting:
 *		a) how to write your own exception
 *		b) showing the printStackTrace() method 
 *		c) emphasizing why you should never write an empty exception-handler.
 *
 *	TASK: Below (at DogPetter.petDogRandomly() - the comment states that you 
 *			should never write an empty	exception handler - why is that?
 */
import java.util.Random;
class AngryDogException extends Exception{
	public String getMessage(){
		return "sensitive petting location";
	}
}
class TestDogPetter
{
	public static void main(String[] args)	{
		Dog fido = new Dog();
		DogPetter aDogPetter = new DogPetter();
		aDogPetter.petDogRandomly( fido );
		
	}
}
class Dog{
	static final String[] dogLocations = {"head","under chin", "back", "sensitive-place"};
	
	void acceptPetting(String location) throws AngryDogException{
		if( location.equals("sensitive-place") ){ 	//if you pet the dog on a sensitive-place
			if( Math.random() > .2 )				// 80% of the time you'll get an AngryDog
			{	
				throw new AngryDogException(); 		//the dog might take Exception to it!
			}
		}else{
			System.out.println("Pet Dog's "+location+"... Dog is Happy With Petting");
		}
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
		}							// At least call printStackTrace()
	}
} 








