class PokerDealer
{
	static PokerDealer _instance;	//static ref of same type as self 		
	static int numObjects;
	Deck deckOfCards;
	
	// can't be called from outside the class
	private PokerDealer()
	{
		System.out.println("PokerDealer()");
		numObjects++;
		deckOfCards = new Deck();
	}

	// important that this is static 
	public static PokerDealer instance()   
	{
		System.out.println("instance()");
		if(_instance == null)
		{
			_instance = new PokerDealer(); 
		}
		
		return _instance; //return instance that already has been set
	}
}
// multi thread issue:
// thread calls same thing - switches out
// will mean more than one instance actually created

class Deck
{
	private static int numOfCards = 52;

	Deck(){
		System.out.println("Deck of " + numOfCards + " cards");
	}
}