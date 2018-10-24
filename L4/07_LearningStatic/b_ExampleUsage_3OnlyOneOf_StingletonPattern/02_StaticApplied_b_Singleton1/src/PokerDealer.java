class PokerDealer
{
	static PokerDealer _instance;			
	static int numObjects;
	Deck deckOfCards;
	
	private PokerDealer()
	{
		System.out.println("PokerDealer()");
		numObjects++;
		deckOfCards = new Deck();
	}

	public static PokerDealer instance()   
	{
		System.out.println("instance()");
		if(_instance == null)
		{
			_instance = new PokerDealer();
		}
		
		return _instance;
	}
}

class Deck
{
	//code for Deck here
}